// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class uj4 extends hn {
    public final /* synthetic */ byte e0 = 0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj4(View view) {
        super(false, false, false, false, true);
        this.f0 = view;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        byte b = this.e0;
        Object obj = this.f0;
        switch (b) {
            case 0:
                ((View) obj).invalidate();
                break;
            case 1:
                ((Runnable) obj).run();
                break;
            default:
                ((voa) obj).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj4(Runnable runnable) {
        super(false, true, true, true, false);
        this.f0 = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj4(voa voaVar) {
        super(false, false, false, true, true);
        this.f0 = voaVar;
    }
}
