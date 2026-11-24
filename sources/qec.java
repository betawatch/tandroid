// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qec extends AsyncTask {
    public int a = 0;
    public final /* synthetic */ tec b;

    public qec(tec tecVar) {
        this.b = tecVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        tec tecVar = this.b;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = tecVar.r.getFrameAtTime(tecVar.y * this.a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime == null) {
                        return frameAtTime;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(tecVar.E, tecVar.F, frameAtTime.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    float max = Math.max(tecVar.E / frameAtTime.getWidth(), tecVar.F / frameAtTime.getHeight());
                    int width = (int) (frameAtTime.getWidth() * max);
                    int height = (int) (frameAtTime.getHeight() * max);
                    canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((tecVar.E - width) / 2, (tecVar.F - height) / 2, width, height), (Paint) null);
                    frameAtTime.recycle();
                    return createBitmap;
                }
            } catch (Exception e2) {
                e = e2;
                bitmap = frameAtTime;
                fc4.g(e, true);
                return bitmap;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (isCancelled()) {
            return;
        }
        tec tecVar = this.b;
        tecVar.w.add(bitmap);
        tecVar.invalidate();
        int i = this.a;
        if (i < tecVar.G) {
            tecVar.b(i + 1);
        } else {
            tecVar.P = true;
        }
    }
}
