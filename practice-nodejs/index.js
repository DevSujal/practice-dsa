const fs = require("fs/promises")
const path = require("path")

const currPath = __dirname

const moveFileToThatFolder = async (filePath) => {

    const extentionNameWithDot = path.extname(filePath)
    const extname = extentionNameWithDot.substring(1, extentionNameWithDot.length)

        try {
            await fs.mkdir(extname)
        } catch (error) {
            console.log("folder already exists")  
        }

   const folder = path.join(currPath, extname)

    const basename = path.basename(filePath)

    await fs.rename(filePath, folder + "/" + basename)

}


 moveFileToThatFolder(path.join(currPath, "/me.jpg"))
 moveFileToThatFolder(path.join(currPath, "/name.png"))
 moveFileToThatFolder(path.join(currPath, "/pdf.pdf"))
 moveFileToThatFolder(path.join(currPath, "/rahul.zip"))
 moveFileToThatFolder(path.join(currPath, "/rohan.zip"))



