// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
