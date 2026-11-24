// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yt1 extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ mu1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt1(mu1 mu1Var, Context context) {
        super(context);
        this.c = mu1Var;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        mu1 mu1Var = this.c;
        arrayList.add(mu1Var.Z1);
        arrayList.add(mu1Var.A0);
        arrayList.add(mu1Var.Z);
        arrayList.add(mu1Var.Z3);
        arrayList.add(mu1Var.X1);
        arrayList.add(mu1Var.m3);
        arrayList.add(mu1Var.a0);
        arrayList.add(mu1Var.y1);
        arrayList.add(mu1Var.U);
        arrayList.add(mu1Var.g2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mu1 mu1Var = this.c;
        mu1Var.Zc = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        mu1Var.Zc = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        mu1 mu1Var = this.c;
        mu1Var.Zc = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.b.add(view);
            }
        }
        mu1Var.Zc = false;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        a();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f);
            }
        }
    }
}
