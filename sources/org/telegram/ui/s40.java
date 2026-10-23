package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class s40 implements org.telegram.ui.Components.cl0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ q50 c;

    public s40(q50 q50Var) {
        this.c = q50Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.cl0
    public final boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = i1Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = i1Var.g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        q50 q50Var = this.c;
        q50Var.B1(tL_textWithEntities);
        p30 p30Var = q50Var.H;
        if (p30Var.m()) {
            p30Var.j();
        } else {
            p30Var.d();
        }
        ah.t0 reactionsWindow = q50Var.K.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        q50Var.K.getReactionsWindow().e();
        q50Var.K.n();
    }

    @Override // org.telegram.ui.Components.cl0
    public final void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.b;
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        q50 q50Var = this.c;
        if (q50Var.Q2 != null) {
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
            canvas.translate(-q50Var.K.getX(), -q50Var.K.getY());
            float f12 = q50Var.R2;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(q50Var.Q2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public final boolean w() {
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ void v() {
    }
}
