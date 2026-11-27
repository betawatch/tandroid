// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
