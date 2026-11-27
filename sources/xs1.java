// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xs1 extends by4 {
    public final /* synthetic */ zu1 m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs1(zu1 zu1Var, Activity activity, e eVar) {
        super(activity, eVar);
        this.m1 = zu1Var;
    }

    @Override // by4
    public final void E0() {
        zu1 zu1Var = this.m1;
        zu1Var.i6();
        UndoView undoView = zu1Var.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        zu1Var.getMessagesController().v4(zu1Var.l6, "CONVERT_GIGAGROUP");
    }

    @Override // by4
    public final void F0() {
        zu1 zu1Var = this.m1;
        zu1Var.getMessagesController().Q(zu1Var.getParentActivity(), zu1Var.e, zu1Var, new rd1(this, (byte) 10));
    }
}
