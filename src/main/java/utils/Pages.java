package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.alerts.AlertTypes_Page_1;
import pages.autoComplete.MultipleAndRemote_Page;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovement_Page;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.Handles_Page;
import pages.droppable.Droppable_Accept_Page;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.Droppable_Revert_Draggable_Position_Page;
import pages.iframe.NestedIframe_Page;
import pages.iframe.NormalIframe_Page;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.Synchronus_Resize_Page;
import pages.resizable.Textarea_Page;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.Selectable_Serialize_Page;

public class Pages {


    private AlertTypes_Page alertTypesPage;
    private AlertTypes_Page_1 alertTypes_page_1;
    private Animate_Page animatePage;
    private AutoScrolling_Page autoScrollingPage;
    private ConstrainMovement_Page constrainMovementPage;
    private Draggable_DefFunc_Page draggableDefFuncPage;
    private Droppable_Accept_Page droppableAcceptPage;
    private Droppable_DefFunc_Page droppableDefFuncPage;
    private Droppable_Revert_Draggable_Position_Page droppableRevertDraggablePositionPage;
    private Handles_Page handlesPage;
    private HomePage homePage;
    private MultipleAndRemote_Page multipleAndRemotePage;
    private NormalIframe_Page normalIframePage;
    private NestedIframe_Page nestedIframePage;
    private Resizable_DefFunc_Page resizableDefFuncPage;
    private Selectable_DefFunc_Page selectableDefFuncPage;
    private Selectable_Serialize_Page selectableSerializePage;
    private Synchronus_Resize_Page synchronusResizePage;
    private Textarea_Page textareaPage;
    private WebAutomationPage webAutomationPage;

    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        droppableAcceptPage = new Droppable_Accept_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        normalIframePage = new NormalIframe_Page();
        nestedIframePage = new NestedIframe_Page();
        alertTypesPage = new AlertTypes_Page();
        alertTypes_page_1 = new AlertTypes_Page_1();
        animatePage = new Animate_Page();
        multipleAndRemotePage = new MultipleAndRemote_Page();
        constrainMovementPage  = new ConstrainMovement_Page();
        handlesPage = new Handles_Page();
        droppableRevertDraggablePositionPage = new Droppable_Revert_Draggable_Position_Page();
        synchronusResizePage = new Synchronus_Resize_Page();
        textareaPage = new Textarea_Page();
        selectableSerializePage = new Selectable_Serialize_Page();
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }
    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }
    public Droppable_Accept_Page getDroppableAcceptPage(){return droppableAcceptPage;}
    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }
    public ConstrainMovement_Page getConstrainMovementPage(){return constrainMovementPage;}
    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }
    public Droppable_Revert_Draggable_Position_Page getDroppableRevertDraggablePositionPage(){return droppableRevertDraggablePositionPage;}
    public Handles_Page getHandlesPage(){return handlesPage;}
    public Resizable_DefFunc_Page getResizableDefFuncPage(){
        return resizableDefFuncPage;
    }
    public Selectable_DefFunc_Page getSelectableDefFuncPage(){
        return selectableDefFuncPage;
    }
    public Selectable_Serialize_Page getSelectableSerializePage(){return selectableSerializePage;}
    public Synchronus_Resize_Page getSynchronusResizePage(){return synchronusResizePage;}
    public Textarea_Page getTextareaPage(){return textareaPage;}
    public NormalIframe_Page getNormalIframePage(){return normalIframePage;}
    public NestedIframe_Page getNestedIframePage(){
        return nestedIframePage;
    }
    public AlertTypes_Page getAlertTypesPage(){
        return alertTypesPage;
    }
    public AlertTypes_Page_1 getAlertTypes_page_1(){return alertTypes_page_1;}
    public Animate_Page getAnimatePage(){
        return animatePage;
    }
    public MultipleAndRemote_Page getMultipleAndRemotePage(){
        return multipleAndRemotePage;
    }
}
