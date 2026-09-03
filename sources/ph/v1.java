package ph;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h50;
import org.telegram.ui.eu;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class v1 extends t1 {
    public mg.h0 i;
    public mg.h0 j;
    public int k;
    public final org.telegram.ui.Components.z5 l;
    public Timer m;
    public final nh.o8 n;
    public final ArrayList o;
    public final /* synthetic */ w1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var) {
        super(w1Var);
        int i10;
        this.p = w1Var;
        this.i = new mg.h0(w1Var);
        this.j = new mg.h0(w1Var);
        this.l = new org.telegram.ui.Components.z5(w1Var);
        this.n = new nh.o8(w1Var);
        this.o = new ArrayList();
        this.a = 3;
        this.b = AndroidUtilities.dp(44.0f);
        this.c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.g3) w1Var.f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.o.add(mg.q0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.o, new eu(16));
        if (!this.o.isEmpty()) {
            this.i.e((mg.q0) this.o.get(this.k));
        }
        this.l.d(1.0f, true);
    }

    @Override // ph.t1
    public final void a(Canvas canvas, float f10, float f11) {
        float dp = f11 - AndroidUtilities.dp(4.0f);
        float f12 = (int) f10;
        float f13 = (int) dp;
        float f14 = this.b;
        float f15 = (int) (f10 + f14);
        float f16 = (int) (dp + f14);
        RectF rectF = this.f;
        rectF.set(f12, f13, f15, f16);
        float a2 = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int i12 = (int) rectF.right;
        int i13 = (int) rectF.bottom;
        nh.o8 o8Var = this.n;
        o8Var.setBounds(i10, i11, i12, i13);
        o8Var.draw(canvas);
        float dp2 = AndroidUtilities.dp(30.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        float f17 = dp2 / 2.0f;
        rect.set((int) (rectF.centerX() - f17), (int) (rectF.centerY() - f17), (int) (rectF.centerX() + f17), (int) (rectF.centerY() + f17));
        float d = this.l.d(1.0f, false);
        this.j.c(rect);
        this.i.c(rect);
        if (d == 1.0f) {
            this.i.a(canvas);
        } else {
            canvas.save();
            float f18 = 1.0f - d;
            canvas.scale(f18, f18, rectF.centerX(), rectF.top);
            mg.h0 h0Var = this.j;
            h0Var.h = f18;
            h0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            mg.h0 h0Var2 = this.i;
            h0Var2.h = d;
            h0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // ph.t1
    public final void b(boolean z4) {
        this.i.b(z4);
        this.j.b(z4);
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
        if (z4) {
            Timer timer2 = new Timer();
            this.m = timer2;
            timer2.schedule(new h50(this, 3), 2000L, 2000L);
        }
    }
}
