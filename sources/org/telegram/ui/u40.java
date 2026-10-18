package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class u40 implements org.telegram.ui.Components.bl0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ s50 c;

    public u40(s50 s50Var) {
        this.c = s50Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.bl0
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public final void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
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
        s50 s50Var = this.c;
        s50Var.B1(tL_textWithEntities);
        r30 r30Var = s50Var.H;
        if (r30Var.m()) {
            r30Var.j();
        } else {
            r30Var.d();
        }
        ah.t0 reactionsWindow = s50Var.K.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        s50Var.K.getReactionsWindow().e();
        s50Var.K.n();
    }

    @Override // org.telegram.ui.Components.bl0
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.b;
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        s50 s50Var = this.c;
        if (s50Var.Q2 != null) {
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
            canvas.translate(-s50Var.K.getX(), -s50Var.K.getY());
            float f12 = s50Var.R2;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(s50Var.Q2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public final boolean s() {
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ void q() {
    }
}
