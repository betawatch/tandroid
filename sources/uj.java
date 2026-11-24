// default package

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uj extends g6c {
    public final /* synthetic */ byte e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj(Object obj, byte b) {
        super("@stickers", (wkb) null);
        this.e = b;
        this.f = obj;
    }

    @Override // g6c, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                ((d) this.f).dismissCurrentDialog();
                super.onClick(view);
                break;
            case 1:
                kd5 kd5Var = ((id5) this.f).d;
                i = ((d) kd5Var).currentAccount;
                oc7.r1(i).C3("stickers", kd5Var, 1, null);
                break;
            case 2:
                ((iz7) this.f).a.dismissCurrentDialog();
                super.onClick(view);
                break;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.f;
                i2 = ((d) stickersActivity).currentAccount;
                oc7.r1(i2).C3("stickers", stickersActivity, 3, null);
                break;
            case 4:
                x2b x2bVar = (x2b) this.f;
                oc7.r1(x2bVar.a).C3(getURL(), x2bVar.F1, 1, null);
                x2bVar.dismiss();
                break;
            default:
                gm.g(getURL());
                c41.b0((m51) this.f).k(false).j();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj(byte b, Object obj, String str) {
        super(str, (wkb) null);
        this.e = b;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj(String str, wkb wkbVar) {
        super(str, wkbVar);
        this.e = (byte) 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(String str, d dVar) {
        super(str, (wkb) null);
        this.e = (byte) 0;
        this.f = dVar;
    }
}
