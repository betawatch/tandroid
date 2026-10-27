package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z40 implements org.telegram.ui.Components.fl0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ x50 c;

    public z40(x50 x50Var) {
        this.c = x50Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.b;
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        x50 x50Var = this.c;
        if (x50Var.Q2 != null) {
            canvas.save();
            if (f7 > 0.0f) {
                Path path = this.a;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                path.close();
                canvas.clipPath(path);
            } else {
                canvas.clipRect(rectF);
            }
            canvas.translate(-x50Var.K.getX(), -x50Var.K.getY());
            float f12 = x50Var.R2;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(x50Var.Q2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = x0Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = x0Var.g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        x50 x50Var = this.c;
        x50Var.A1(tL_textWithEntities);
        w30 w30Var = x50Var.H;
        if (w30Var.m()) {
            w30Var.j();
        } else {
            w30Var.d();
        }
        bh.i0 reactionsWindow = x50Var.K.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        x50Var.K.getReactionsWindow().e();
        x50Var.K.n();
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void m() {
    }
}
