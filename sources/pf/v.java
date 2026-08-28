package pf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import fh.k6;
import g7.e6;
import j$.util.Objects;
import kh.g4;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;
import qh.x1;
import yf.j2;
import yf.m2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j2 j10;
        switch (this.a) {
            case 0:
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.b;
                qn qnVar = (qn) this.c;
                AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                oc.a0(qnVar).k(false).j();
                break;
            case 1:
                g0.P((g0) this.b, (TL_account.TL_connectedBot) this.c);
                break;
            case 2:
                ph.b bVar = (ph.b) this.b;
                Runnable runnable = (Runnable) this.c;
                bVar.getClass();
                runnable.run();
                bVar.dismiss();
                break;
            case 3:
                x1.X((x1) this.b, (Context) this.c, view);
                break;
            case 4:
                xf.x xVar = (xf.x) this.b;
                Context context = (Context) this.c;
                if (!xVar.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    xf.n nVar = new xf.n(xVar, context, createBitmap);
                    xVar.n.f().addView(nVar, e6.c(-1.0f, -1));
                    xf.u uVar = xVar.n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new k6(uVar, 6));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(gr.f);
                    duration.addUpdateListener(new g4(nVar, 22));
                    duration.start();
                    xVar.n.a();
                    xVar.dismiss();
                    break;
                }
                break;
            case 5:
                m2 m2Var = (m2) this.b;
                kh.oc ocVar = (kh.oc) this.c;
                j2[] j2VarArr = m2Var.D;
                if (j2VarArr != null && j2VarArr.length != 0 && m2Var.E != null && (j10 = m2Var.j(m2Var.j0, m2Var.k0)) != null) {
                    ocVar.run(j10);
                    break;
                }
                break;
            case 6:
                jn.c0((qn) this.c, 41026, new i9((yg.c) this.b, 24), null);
                break;
            default:
                zf.j0.U((zf.j0) this.b, (Context) this.c);
                break;
        }
    }
}
