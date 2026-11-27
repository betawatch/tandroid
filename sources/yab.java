// default package

import android.app.Activity;
import android.app.Dialog;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class yab extends e {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yab(sbb sbbVar, byte b) {
        super(null);
        this.a = b;
        switch (b) {
            case 1:
                this.b = sbbVar;
                super(null);
                this.currentAccount = sbbVar.c;
                break;
            default:
                this.b = sbbVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Activity getParentActivity() {
        byte b = this.a;
        sbb sbbVar = this.b;
        switch (b) {
        }
        return sbbVar.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final vnb getResourceProvider() {
        byte b = this.a;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                return new pu0(sbbVar.a, (byte) 8);
            default:
                return new pu0(sbbVar.a, (byte) 9);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        byte b = this.a;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean presentFragment(e eVar) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(eVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
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
