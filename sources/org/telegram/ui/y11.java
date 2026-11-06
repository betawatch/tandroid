package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class y11 extends View {
    public final Paint a;
    public int b;
    public LinearGradient c;
    public final /* synthetic */ a21 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y11(a21 a21Var, Context context) {
        super(context);
        this.d = a21Var;
        this.a = new Paint(1);
        this.b = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, a21Var.I0);
        this.c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, this.b), this.b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.d.I0);
        if (w02 != this.b) {
            this.b = w02;
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.c;
        Paint paint = this.a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
