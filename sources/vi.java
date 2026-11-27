// default package

import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vi extends f8c {
    public final /* synthetic */ byte e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi(Object obj, byte b) {
        super("@stickers", (rmb) null);
        this.e = b;
        this.f = obj;
    }

    @Override // f8c, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                ((e) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                nd5 nd5Var = ((ld5) this.f).d;
                i = ((e) nd5Var).currentAccount;
                uc7.s1(i).H3("stickers", nd5Var, 1, null);
                break;
            case 2:
                ((m08) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i2 = ((e) stickersActivity).currentAccount;
                uc7.s1(i2).H3("stickers", stickersActivity, 3, null);
                break;
            case 4:
                s4b s4bVar = (s4b) this.f;
                uc7.s1(s4bVar.a).H3(getURL(), s4bVar.F1, 1, null);
                s4bVar.dismiss();
                break;
            default:
                hl.g(getURL());
                d31.b0((n41) this.f).k(false).j();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi(byte b, Object obj, String str) {
        super(str, (rmb) null);
        this.e = b;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi(String str, rmb rmbVar) {
        super(str, rmbVar);
        this.e = (byte) 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(String str, e eVar) {
        super(str, (rmb) null);
        this.e = (byte) 0;
        this.f = eVar;
    }
}
