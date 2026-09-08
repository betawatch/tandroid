package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r71 extends View {
    public final Paint a;
    public final LinearGradient b;

    public r71(t71 t71Var, Context context) {
        super(context);
        this.a = new Paint(1);
        float dp = AndroidUtilities.dp(68.0f);
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        this.b = new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, t71Var.getThemedColor(i10)), t71Var.getThemedColor(i10)}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient = this.b;
        Paint paint = this.a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
