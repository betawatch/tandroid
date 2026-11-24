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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class os6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ws6 b;

    public os6(ws6 ws6Var, boolean z) {
        this.b = ws6Var;
        this.a = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        ws6 ws6Var = this.b;
        ws6Var.K.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (ws6Var.w0) {
            ws6Var.x0 = true;
            return;
        }
        eu6 eu6Var = ws6Var.r;
        int i2 = ws6Var.R.getLayoutParams().height;
        ws6.o(-1, ws6Var.R);
        ws6Var.u(ws6Var.h());
        View decorView = ws6Var.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(ws6Var.getWindow().getAttributes().width, TLObject.FLAG_30), 0);
        ws6.o(i2, ws6Var.R);
        if (!(ws6Var.L.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) ws6Var.L.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = ws6Var.k(bitmap.getWidth(), bitmap.getHeight());
            ws6Var.L.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int l = ws6Var.l(ws6Var.h());
        int size = ws6Var.X.size();
        int size2 = ws6Var.n() ? DesugarCollections.unmodifiableList(eu6Var.v).size() * ws6Var.f0 : 0;
        if (size > 0) {
            size2 += ws6Var.h0;
        }
        int min = Math.min(size2, ws6Var.g0);
        if (!ws6Var.v0) {
            min = 0;
        }
        int max = Math.max(i, min) + l;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (ws6Var.J.getMeasuredHeight() - ws6Var.K.getMeasuredHeight());
        if (i <= 0 || max > height) {
            if (ws6Var.R.getMeasuredHeight() + ws6Var.V.getLayoutParams().height >= ws6Var.K.getMeasuredHeight()) {
                ws6Var.L.setVisibility(8);
            }
            max = min + l;
            i = 0;
        } else {
            ws6Var.L.setVisibility(0);
            ws6.o(i, ws6Var.L);
        }
        if (!ws6Var.h() || max > height) {
            ws6Var.S.setVisibility(8);
        } else {
            ws6Var.S.setVisibility(0);
        }
        ws6Var.u(ws6Var.S.getVisibility() == 0);
        int l2 = ws6Var.l(ws6Var.S.getVisibility() == 0);
        int max2 = Math.max(i, min) + l2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        ws6Var.R.clearAnimation();
        ws6Var.V.clearAnimation();
        ws6Var.K.clearAnimation();
        LinearLayout linearLayout = ws6Var.R;
        boolean z = this.a;
        if (z) {
            ws6Var.f(l2, linearLayout);
            ws6Var.f(min, ws6Var.V);
            ws6Var.f(height, ws6Var.K);
        } else {
            ws6.o(l2, linearLayout);
            ws6.o(min, ws6Var.V);
            ws6.o(height, ws6Var.K);
        }
        ws6.o(rect.height(), ws6Var.I);
        List unmodifiableList = DesugarCollections.unmodifiableList(eu6Var.v);
        boolean isEmpty = unmodifiableList.isEmpty();
        ArrayList arrayList = ws6Var.X;
        if (isEmpty) {
            arrayList.clear();
            ws6Var.W.notifyDataSetChanged();
            return;
        }
        if (new HashSet(arrayList).equals(new HashSet(unmodifiableList))) {
            ws6Var.W.notifyDataSetChanged();
            return;
        }
        if (z) {
            OverlayListView overlayListView = ws6Var.V;
            vs6 vs6Var = ws6Var.W;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                Object item = vs6Var.getItem(firstVisiblePosition + i3);
                View childAt = overlayListView.getChildAt(i3);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z) {
            Context context = ws6Var.s;
            OverlayListView overlayListView2 = ws6Var.V;
            vs6 vs6Var2 = ws6Var.W;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                Object item2 = vs6Var2.getItem(firstVisiblePosition2 + i4);
                View childAt2 = overlayListView2.getChildAt(i4);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList2 = ws6Var.X;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList2);
        ws6Var.Y = hashSet;
        HashSet hashSet2 = new HashSet(ws6Var.X);
        hashSet2.removeAll(unmodifiableList);
        ws6Var.Z = hashSet2;
        ws6Var.X.addAll(0, ws6Var.Y);
        ws6Var.X.removeAll(ws6Var.Z);
        ws6Var.W.notifyDataSetChanged();
        if (z && ws6Var.v0) {
            if (ws6Var.Z.size() + ws6Var.Y.size() > 0) {
                ws6Var.V.setEnabled(false);
                ws6Var.V.requestLayout();
                ws6Var.w0 = true;
                ws6Var.V.getViewTreeObserver().addOnGlobalLayoutListener(new qs6(ws6Var, hashMap, hashMap2));
                return;
            }
        }
        ws6Var.Y = null;
        ws6Var.Z = null;
    }
}
