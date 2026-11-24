// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w94 extends ft4 {
    public final /* synthetic */ byte j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w94(gk8 gk8Var, Context context, int i, int i2, Context context2) {
        super(context, i, i2);
        this.j0 = (byte) 4;
    }

    @Override // ft4
    public final void g() {
        switch (this.j0) {
            case 4:
                boolean z = e21.a;
                break;
        }
    }

    @Override // ft4
    public final void n() {
        switch (this.j0) {
            case 5:
                break;
            default:
                super.n();
                break;
        }
    }

    @Override // ft4, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        switch (this.j0) {
            case 0:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 1:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 2:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 3:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // ft4, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.j0) {
            case 0:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 1:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 2:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 3:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w94(Context context, int i, int i2, byte b) {
        super(context, i, i2);
        this.j0 = b;
    }

    private final void p() {
    }
}
