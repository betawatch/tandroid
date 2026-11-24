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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ou6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ wu6 b;

    public ou6(wu6 wu6Var, boolean z) {
        this.b = wu6Var;
        this.a = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        wu6 wu6Var = this.b;
        wu6Var.K.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (wu6Var.w0) {
            wu6Var.x0 = true;
            return;
        }
        ew6 ew6Var = wu6Var.r;
        int i2 = wu6Var.R.getLayoutParams().height;
        wu6.o(-1, wu6Var.R);
        wu6Var.u(wu6Var.h());
        View decorView = wu6Var.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(wu6Var.getWindow().getAttributes().width, TLObject.FLAG_30), 0);
        wu6.o(i2, wu6Var.R);
        if (!(wu6Var.L.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) wu6Var.L.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = wu6Var.k(bitmap.getWidth(), bitmap.getHeight());
            wu6Var.L.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int l = wu6Var.l(wu6Var.h());
        int size = wu6Var.X.size();
        int size2 = wu6Var.n() ? DesugarCollections.unmodifiableList(ew6Var.v).size() * wu6Var.f0 : 0;
        if (size > 0) {
            size2 += wu6Var.h0;
        }
        int min = Math.min(size2, wu6Var.g0);
        if (!wu6Var.v0) {
            min = 0;
        }
        int max = Math.max(i, min) + l;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (wu6Var.J.getMeasuredHeight() - wu6Var.K.getMeasuredHeight());
        if (i <= 0 || max > height) {
            if (wu6Var.R.getMeasuredHeight() + wu6Var.V.getLayoutParams().height >= wu6Var.K.getMeasuredHeight()) {
                wu6Var.L.setVisibility(8);
            }
            max = min + l;
            i = 0;
        } else {
            wu6Var.L.setVisibility(0);
            wu6.o(i, wu6Var.L);
        }
        if (!wu6Var.h() || max > height) {
            wu6Var.S.setVisibility(8);
        } else {
            wu6Var.S.setVisibility(0);
        }
        wu6Var.u(wu6Var.S.getVisibility() == 0);
        int l2 = wu6Var.l(wu6Var.S.getVisibility() == 0);
        int max2 = Math.max(i, min) + l2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        wu6Var.R.clearAnimation();
        wu6Var.V.clearAnimation();
        wu6Var.K.clearAnimation();
        LinearLayout linearLayout = wu6Var.R;
        boolean z = this.a;
        if (z) {
            wu6Var.f(l2, linearLayout);
            wu6Var.f(min, wu6Var.V);
            wu6Var.f(height, wu6Var.K);
        } else {
            wu6.o(l2, linearLayout);
            wu6.o(min, wu6Var.V);
            wu6.o(height, wu6Var.K);
        }
        wu6.o(rect.height(), wu6Var.I);
        List unmodifiableList = DesugarCollections.unmodifiableList(ew6Var.v);
        boolean isEmpty = unmodifiableList.isEmpty();
        ArrayList arrayList = wu6Var.X;
        if (isEmpty) {
            arrayList.clear();
            wu6Var.W.notifyDataSetChanged();
            return;
        }
        if (new HashSet(arrayList).equals(new HashSet(unmodifiableList))) {
            wu6Var.W.notifyDataSetChanged();
            return;
        }
        if (z) {
            OverlayListView overlayListView = wu6Var.V;
            vu6 vu6Var = wu6Var.W;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                Object item = vu6Var.getItem(firstVisiblePosition + i3);
                View childAt = overlayListView.getChildAt(i3);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z) {
            Context context = wu6Var.s;
            OverlayListView overlayListView2 = wu6Var.V;
            vu6 vu6Var2 = wu6Var.W;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                Object item2 = vu6Var2.getItem(firstVisiblePosition2 + i4);
                View childAt2 = overlayListView2.getChildAt(i4);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList2 = wu6Var.X;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList2);
        wu6Var.Y = hashSet;
        HashSet hashSet2 = new HashSet(wu6Var.X);
        hashSet2.removeAll(unmodifiableList);
        wu6Var.Z = hashSet2;
        wu6Var.X.addAll(0, wu6Var.Y);
        wu6Var.X.removeAll(wu6Var.Z);
        wu6Var.W.notifyDataSetChanged();
        if (z && wu6Var.v0) {
            if (wu6Var.Z.size() + wu6Var.Y.size() > 0) {
                wu6Var.V.setEnabled(false);
                wu6Var.V.requestLayout();
                wu6Var.w0 = true;
                wu6Var.V.getViewTreeObserver().addOnGlobalLayoutListener(new qu6(wu6Var, hashMap, hashMap2));
                return;
            }
        }
        wu6Var.Y = null;
        wu6Var.Z = null;
    }
}
