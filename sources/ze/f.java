package ze;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f {
    public final Picture a;
    public final RenderNode b;

    public f(int i9, int i10, Utilities.Callback callback) {
        Picture picture = new Picture();
        this.a = picture;
        callback.run(picture.beginRecording(i9, i10));
        picture.endRecording();
        if (Build.VERSION.SDK_INT < 29) {
            this.b = null;
            return;
        }
        RenderNode renderNode = new RenderNode("pip-node-" + View.generateViewId());
        this.b = renderNode;
        renderNode.setPosition(0, 0, i9, i10);
        renderNode.beginRecording().drawPicture(picture);
        renderNode.endRecording();
    }

    public final void a(Canvas canvas, float f10) {
        Canvas canvas2;
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.b;
            if (renderNode != null) {
                renderNode.setAlpha(f10);
                canvas.drawRenderNode(this.b);
                return;
            }
            return;
        }
        Picture picture = this.a;
        if (picture == null || f10 <= 0.001f) {
            return;
        }
        boolean z10 = f10 < 0.999f;
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), (int) (f10 * 255.0f), 31);
        } else {
            canvas2 = canvas;
        }
        canvas2.drawPicture(picture);
        if (z10) {
            canvas2.restore();
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.b.discardDisplayList();
        }
    }
}
