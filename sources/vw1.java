// default package

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vw1 extends ImageView {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vw1(ChatActivityEnterView chatActivityEnterView, Context context, byte b) {
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
                if (chatActivityEnterView.y1 < 1.0f) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long j = chatActivityEnterView.B7;
                    if (uptimeMillis >= j) {
                        if (chatActivityEnterView.y1 <= 0.0f) {
                            super.draw(canvas);
                            break;
                        } else {
                            int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.y1) * 255.0f));
                            super.draw(canvas);
                            canvas.restoreToCount(saveLayerAlpha);
                            break;
                        }
                    } else {
                        postInvalidateDelayed(Math.max(1L, j - SystemClock.uptimeMillis()));
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
                post(new fw1(this.b, (byte) 25));
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
                cx1 cx1Var = chatActivityEnterView.y2;
                if (cx1Var != null) {
                    cx1Var.setTranslationX(cx1Var.a);
                    break;
                }
                break;
            case 2:
                super.setAlpha(f);
                cx1 cx1Var2 = chatActivityEnterView.y2;
                if (cx1Var2 != null) {
                    cx1Var2.setTranslationX(cx1Var2.a);
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
