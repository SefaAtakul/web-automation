package utils;

import pages.accordion.Collapse_Content_Page;
import pages.button.With_Icon_Page;
import pages.checkBoxRadio.Product_Selector_Page;
import pages.controlGroup.ToolBar_Page;
import pages.datepicker.DisplayMultipleMonths_Page;
import pages.datepicker.SelecDateRange_Page;
import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.alerts.AlertTypes_Page_1;
import pages.autoComplete.AccentFolding_Page;
import pages.autoComplete.MultipleAndRemote_Page;
import pages.dialog.ModalForm_page;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovement_Page;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.Handles_Page;
import pages.droppable.Droppable_Accept_Page;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.Droppable_Revert_Draggable_Position_Page;
import pages.iframe.NestedIframe_Page;
import pages.iframe.NormalIframe_Page;
import pages.menu.Icons_Page;
import pages.progressBar.DownloadDialog_Page;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.Synchronus_Resize_Page;
import pages.resizable.Textarea_Page;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.Selectable_Serialize_Page;
import pages.slider.SnapToIncrements_Page;
import pages.sortable.DisplayAsGrid_Page;
import pages.sortable.IncludeExcludeItems_Page;
import pages.spinner.SpinnerOverflow_Page;

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
    private AccentFolding_Page accentFoldingPage;
    private NormalIframe_Page normalIframePage;
    private NestedIframe_Page nestedIframePage;
    private Resizable_DefFunc_Page resizableDefFuncPage;
    private Selectable_DefFunc_Page selectableDefFuncPage;
    private Selectable_Serialize_Page selectableSerializePage;
    private Synchronus_Resize_Page synchronusResizePage;
    private Textarea_Page textareaPage;
    private WebAutomationPage webAutomationPage;
    private Icons_Page iconsPage;
    private DownloadDialog_Page downloadDialogPage;
    private DisplayMultipleMonths_Page displayMultipleMonthsPage;
    private  SelecDateRange_Page selecDateRangePage;
    private ToolBar_Page toolBarPage;
    private ModalForm_page modalFormPage;
    private SnapToIncrements_Page snapToIncrementsPage;
    private SpinnerOverflow_Page spinnerOverflowPage;
    private DisplayAsGrid_Page displayAsGridPage;
    private IncludeExcludeItems_Page includeExcludeItemsPage;
    private Collapse_Content_Page collapseContentPage;
    private With_Icon_Page withIconPage;
    private Product_Selector_Page productSelectorPage;


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
        accentFoldingPage = new AccentFolding_Page();
        iconsPage = new Icons_Page();
        downloadDialogPage = new DownloadDialog_Page();
        displayMultipleMonthsPage = new DisplayMultipleMonths_Page();
        selecDateRangePage = new SelecDateRange_Page();
        toolBarPage = new ToolBar_Page();
        modalFormPage = new ModalForm_page();
        snapToIncrementsPage = new SnapToIncrements_Page();
        spinnerOverflowPage = new SpinnerOverflow_Page();
        displayAsGridPage = new DisplayAsGrid_Page();
        includeExcludeItemsPage =new IncludeExcludeItems_Page();
        collapseContentPage = new Collapse_Content_Page();
        withIconPage = new With_Icon_Page();
        productSelectorPage = new Product_Selector_Page();
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
    public AccentFolding_Page getAccentFoldingPage(){return accentFoldingPage;}
    public Icons_Page getMenuIconsPage(){return iconsPage;}
    public DownloadDialog_Page getDownloadDialogPage(){return downloadDialogPage;}
    public DisplayMultipleMonths_Page getDisplayMultipleMonthsPage(){return displayMultipleMonthsPage;}
    public SelecDateRange_Page getSelecDateRangePage(){return selecDateRangePage;}
    public ToolBar_Page getToolBarPage(){return toolBarPage;}
    public ModalForm_page getModalFormPage(){return modalFormPage;}
    public SnapToIncrements_Page getSnapToIncrementsPage(){return snapToIncrementsPage;}
    public SpinnerOverflow_Page getSpinnerOverflowPage(){return spinnerOverflowPage;}
    public DisplayAsGrid_Page getDisplayAsGridPage(){return displayAsGridPage;}
    public IncludeExcludeItems_Page getIncludeExcludeItemsPage(){return includeExcludeItemsPage;}
    public Collapse_Content_Page getCollapseContentPage(){return collapseContentPage;}
    public With_Icon_Page getWithIconPage(){return withIconPage;}
    public Product_Selector_Page getProductSelectorPage(){return productSelectorPage;}
}
