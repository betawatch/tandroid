package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vj0 extends View {
    public final Paint a;
    public int b;
    public int c;
    public final /* synthetic */ zj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj0(zj0 zj0Var, Context context) {
        super(context);
        this.d = zj0Var;
        this.a = new Paint();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.d6);
        Paint paint = this.a;
        if (paint.getShader() == null || this.b != themedColor || this.c != getHeight()) {
            this.b = themedColor;
            this.c = getHeight();
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), themedColor, themedColor & 16777215, Shader.TileMode.CLAMP));
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
