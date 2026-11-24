// default package

import android.app.Activity;
import android.app.Dialog;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class z6b extends d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t7b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6b(t7b t7bVar, byte b) {
        super(null);
        this.a = b;
        switch (b) {
            case 1:
                this.b = t7bVar;
                super(null);
                this.currentAccount = t7bVar.c;
                break;
            default:
                this.b = t7bVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Activity getParentActivity() {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
        }
        return t7bVar.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final wjb getResourceProvider() {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                return new gu0(t7bVar.a, (byte) 8);
            default:
                return new gu0(t7bVar.a, (byte) 9);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        byte b = this.a;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean presentFragment(d dVar) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(dVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
