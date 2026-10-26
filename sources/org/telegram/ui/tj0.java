package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tj0 extends View {
    public final Paint a;
    public int b;
    public int c;
    public final /* synthetic */ xj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj0(xj0 xj0Var, Context context) {
        super(context);
        this.d = xj0Var;
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
