// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class yoc extends src {
    public final /* synthetic */ byte E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yoc(itc itcVar, Context context, olc olcVar) {
        super(context, olcVar, 0);
        this.F = itcVar;
    }

    @Override // src
    public final void a() {
        byte b = this.E;
        Object obj = this.F;
        switch (b) {
            case 0:
                zoc zocVar = (zoc) obj;
                zocVar.o = true;
                setPaused(true);
                setVisibility(8);
                zocVar.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((itc) obj).a.setVisibility(0);
                break;
        }
    }

    @Override // src, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((itc) this.F).a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    break;
                }
                break;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yoc(zoc zocVar, Context context, voc vocVar) {
        super(context, vocVar, 2);
        this.F = zocVar;
    }
}
