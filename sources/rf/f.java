package rf;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f {
    public final Picture a;
    public final RenderNode b;

    public f(int i10, int i11, Utilities.Callback callback) {
        Picture picture = new Picture();
        this.a = picture;
        callback.run(picture.beginRecording(i10, i11));
        picture.endRecording();
        if (Build.VERSION.SDK_INT < 29) {
            this.b = null;
            return;
        }
        RenderNode renderNode = new RenderNode("pip-node-" + View.generateViewId());
        this.b = renderNode;
        renderNode.setPosition(0, 0, i10, i11);
        renderNode.beginRecording().drawPicture(picture);
        renderNode.endRecording();
    }

    public final void a(Canvas canvas, float f7) {
        Canvas canvas2;
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.b;
            if (renderNode != null) {
                renderNode.setAlpha(f7);
                canvas.drawRenderNode(this.b);
                return;
            }
            return;
        }
        Picture picture = this.a;
        if (picture == null || f7 <= 0.001f) {
            return;
        }
        boolean z10 = f7 < 0.999f;
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), (int) (f7 * 255.0f), 31);
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
