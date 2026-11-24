// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tx1 extends ImageView {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx1(ChatActivityEnterView chatActivityEnterView, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (getAlpha() < 0.5f || this.b.y1 > 0.0f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                float f = chatActivityEnterView.y1;
                if (f < 1.0f) {
                    if (f <= 0.0f) {
                        super.draw(canvas);
                        break;
                    } else {
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.y1) * 255.0f));
                        super.draw(canvas);
                        canvas.restoreToCount(saveLayerAlpha);
                        break;
                    }
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                post(new gx1(this.b, (byte) 17));
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                if (getAlpha() <= 0.0f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 1:
                super.setAlpha(f);
                cy1 cy1Var = chatActivityEnterView.z2;
                if (cy1Var != null) {
                    cy1Var.setTranslationX(cy1Var.a);
                    break;
                }
                break;
            case 2:
                super.setAlpha(f);
                cy1 cy1Var2 = chatActivityEnterView.z2;
                if (cy1Var2 != null) {
                    cy1Var2.setTranslationX(cy1Var2.a);
                    break;
                }
                break;
            case 3:
                super.setAlpha(f);
                a aVar = chatActivityEnterView.a1;
                if (aVar != null) {
                    aVar.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 3:
                super.setVisibility(i);
                a aVar = this.b.a1;
                if (aVar != null) {
                    aVar.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }
}
