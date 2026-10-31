package zf;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements y6, yg.b {
    public final /* synthetic */ int a;

    @Override // yg.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 1:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                E.setHasAlpha(false);
                return E;
            case 2:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i10 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i10);
            default:
                int i11 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i11 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.y6
    public void d(int i10, View view) {
        Drawable background = view.getBackground();
        if (background instanceof eq) {
            Drawable drawable = ((eq) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i10);
                view.invalidate();
            }
        }
    }
}
