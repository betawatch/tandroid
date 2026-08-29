package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t40 implements org.telegram.ui.Components.ek0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ r50 c;

    public t40(r50 r50Var) {
        this.c = r50Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.ek0
    public final void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.b;
        if (f9 > 0.0f) {
            canvas.drawRoundRect(rectF, f9, f9, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        r50 r50Var = this.c;
        if (r50Var.M2 != null) {
            canvas.save();
            if (f9 > 0.0f) {
                Path path = this.a;
                path.rewind();
                path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
                path.close();
                canvas.clipPath(path);
            } else {
                canvas.clipRect(rectF);
            }
            canvas.translate(-r50Var.G.getX(), -r50Var.G.getY());
            float f12 = r50Var.N2;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(r50Var.M2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean O() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = q0Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = q0Var.g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        r50 r50Var = this.c;
        r50Var.A1(tL_textWithEntities);
        r30 r30Var = r50Var.D;
        if (r30Var.m()) {
            r30Var.j();
        } else {
            r30Var.d();
        }
        kg.d0 reactionsWindow = r50Var.G.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        r50Var.G.getReactionsWindow().e();
        r50Var.G.n();
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void H() {
    }
}
