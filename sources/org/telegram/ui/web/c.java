package org.telegram.ui.web;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import gh.c6;
import h7.z5;
import j$.util.Objects;
import lh.kc;
import lh.m2;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;
import zf.k2;
import zf.n2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k2 j10;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                org.telegram.ui.a0 a0Var = (org.telegram.ui.a0) this.c;
                lVar.b = true;
                a0Var.run();
                lVar.w.U2.N(true);
                break;
            case 1:
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.b;
                rn rnVar = (rn) this.c;
                AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                mc.a0(rnVar).k(false).j();
                break;
            case 2:
                qf.g0.Q((qf.g0) this.b, (TL_account.TL_connectedBot) this.c);
                break;
            case 3:
                qh.b bVar = (qh.b) this.b;
                Runnable runnable = (Runnable) this.c;
                bVar.getClass();
                runnable.run();
                bVar.dismiss();
                break;
            case 4:
                rh.x1.Y((rh.x1) this.b, (Context) this.c, view);
                break;
            case 5:
                yf.x xVar = (yf.x) this.b;
                Context context = (Context) this.c;
                if (!xVar.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    yf.n nVar = new yf.n(xVar, context, createBitmap);
                    xVar.n.f().addView(nVar, z5.c(-1.0f, -1));
                    yf.u uVar = xVar.n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new c6(uVar, 6));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(er.f);
                    duration.addUpdateListener(new m2(nVar, 25));
                    duration.start();
                    xVar.n.a();
                    xVar.dismiss();
                    break;
                }
                break;
            case 6:
                n2 n2Var = (n2) this.b;
                kc kcVar = (kc) this.c;
                k2[] k2VarArr = n2Var.D;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.E != null && (j10 = n2Var.j(n2Var.j0, n2Var.k0)) != null) {
                    kcVar.run(j10);
                    break;
                }
                break;
            default:
                in.d0((rn) this.c, 41026, new n6((zg.c) this.b, 26), null);
                break;
        }
    }
}
