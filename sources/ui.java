// default package

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ui extends g4c {
    public final /* synthetic */ byte e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui(Object obj, byte b) {
        super("@stickers", (vib) null);
        this.e = b;
        this.f = obj;
    }

    @Override // g4c, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                ((d) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                mb5 mb5Var = ((kb5) this.f).d;
                i = ((d) mb5Var).currentAccount;
                na7.q1(i).z3("stickers", mb5Var, 1, null);
                break;
            case 2:
                ((gx7) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i2 = ((d) stickersActivity).currentAccount;
                na7.q1(i2).z3("stickers", stickersActivity, 3, null);
                break;
            case 4:
                u0b u0bVar = (u0b) this.f;
                na7.q1(u0bVar.a).z3(getURL(), u0bVar.F1, 1, null);
                u0bVar.dismiss();
                break;
            default:
                gl.g(getURL());
                u21.b0((f41) this.f).k(false).j();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui(byte b, Object obj, String str) {
        super(str, (vib) null);
        this.e = b;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui(String str, vib vibVar) {
        super(str, vibVar);
        this.e = (byte) 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(String str, d dVar) {
        super(str, (vib) null);
        this.e = (byte) 0;
        this.f = dVar;
    }
}
