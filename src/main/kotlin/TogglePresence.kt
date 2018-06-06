import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

var isEnabled = true

class TogglePresence : AnAction("Say Hello"){
    override fun actionPerformed(e: AnActionEvent?) {
        val project = e!!.project
        isEnabled = !isEnabled
        Messages.showMessageDialog(project, "Presence enabled = $isEnabled", "This is a message", Messages.getQuestionIcon())
    }
}