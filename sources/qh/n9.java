package qh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class n9 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9(Context context) {
        super(context);
        this.a = 2;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        switch (this.a) {
            case 3:
                super.addView(view, i10, i11);
                ((vg.f) this.b).e();
                break;
            default:
                super.addView(view, i10, i11);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (((rh.g) this.b).b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 0:
                ba baVar = (ba) this.b;
                if (getTranslationY() != f10 && baVar.Z0 != null) {
                    super.setTranslationY(f10);
                    baVar.Z0.y();
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }
}
