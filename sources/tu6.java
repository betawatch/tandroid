// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.mediarouter.app.OverlayListView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tu6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bv6 b;

    public tu6(bv6 bv6Var, boolean z) {
        this.b = bv6Var;
        this.a = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        bv6 bv6Var = this.b;
        bv6Var.K.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (bv6Var.w0) {
            bv6Var.x0 = true;
            return;
        }
        jw6 jw6Var = bv6Var.r;
        int i2 = bv6Var.R.getLayoutParams().height;
        bv6.o(-1, bv6Var.R);
        bv6Var.u(bv6Var.h());
        View decorView = bv6Var.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(bv6Var.getWindow().getAttributes().width, TLObject.FLAG_30), 0);
        bv6.o(i2, bv6Var.R);
        if (!(bv6Var.L.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) bv6Var.L.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = bv6Var.k(bitmap.getWidth(), bitmap.getHeight());
            bv6Var.L.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int l = bv6Var.l(bv6Var.h());
        int size = bv6Var.X.size();
        int size2 = bv6Var.n() ? DesugarCollections.unmodifiableList(jw6Var.v).size() * bv6Var.f0 : 0;
        if (size > 0) {
            size2 += bv6Var.h0;
        }
        int min = Math.min(size2, bv6Var.g0);
        if (!bv6Var.v0) {
            min = 0;
        }
        int max = Math.max(i, min) + l;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (bv6Var.J.getMeasuredHeight() - bv6Var.K.getMeasuredHeight());
        if (i <= 0 || max > height) {
            if (bv6Var.R.getMeasuredHeight() + bv6Var.V.getLayoutParams().height >= bv6Var.K.getMeasuredHeight()) {
                bv6Var.L.setVisibility(8);
            }
            max = min + l;
            i = 0;
        } else {
            bv6Var.L.setVisibility(0);
            bv6.o(i, bv6Var.L);
        }
        if (!bv6Var.h() || max > height) {
            bv6Var.S.setVisibility(8);
        } else {
            bv6Var.S.setVisibility(0);
        }
        bv6Var.u(bv6Var.S.getVisibility() == 0);
        int l2 = bv6Var.l(bv6Var.S.getVisibility() == 0);
        int max2 = Math.max(i, min) + l2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        bv6Var.R.clearAnimation();
        bv6Var.V.clearAnimation();
        bv6Var.K.clearAnimation();
        LinearLayout linearLayout = bv6Var.R;
        boolean z = this.a;
        if (z) {
            bv6Var.f(l2, linearLayout);
            bv6Var.f(min, bv6Var.V);
            bv6Var.f(height, bv6Var.K);
        } else {
            bv6.o(l2, linearLayout);
            bv6.o(min, bv6Var.V);
            bv6.o(height, bv6Var.K);
        }
        bv6.o(rect.height(), bv6Var.I);
        List unmodifiableList = DesugarCollections.unmodifiableList(jw6Var.v);
        boolean isEmpty = unmodifiableList.isEmpty();
        ArrayList arrayList = bv6Var.X;
        if (isEmpty) {
            arrayList.clear();
            bv6Var.W.notifyDataSetChanged();
            return;
        }
        if (new HashSet(arrayList).equals(new HashSet(unmodifiableList))) {
            bv6Var.W.notifyDataSetChanged();
            return;
        }
        if (z) {
            OverlayListView overlayListView = bv6Var.V;
            av6 av6Var = bv6Var.W;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                Object item = av6Var.getItem(firstVisiblePosition + i3);
                View childAt = overlayListView.getChildAt(i3);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z) {
            Context context = bv6Var.s;
            OverlayListView overlayListView2 = bv6Var.V;
            av6 av6Var2 = bv6Var.W;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                Object item2 = av6Var2.getItem(firstVisiblePosition2 + i4);
                View childAt2 = overlayListView2.getChildAt(i4);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList2 = bv6Var.X;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList2);
        bv6Var.Y = hashSet;
        HashSet hashSet2 = new HashSet(bv6Var.X);
        hashSet2.removeAll(unmodifiableList);
        bv6Var.Z = hashSet2;
        bv6Var.X.addAll(0, bv6Var.Y);
        bv6Var.X.removeAll(bv6Var.Z);
        bv6Var.W.notifyDataSetChanged();
        if (z && bv6Var.v0) {
            if (bv6Var.Z.size() + bv6Var.Y.size() > 0) {
                bv6Var.V.setEnabled(false);
                bv6Var.V.requestLayout();
                bv6Var.w0 = true;
                bv6Var.V.getViewTreeObserver().addOnGlobalLayoutListener(new vu6(bv6Var, hashMap, hashMap2));
                return;
            }
        }
        bv6Var.Y = null;
        bv6Var.Z = null;
    }
}
