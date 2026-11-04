package vg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.SparseIntArray;
import ci.r4;
import ci.y4;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i extends a {
    public final ArrayList d;
    public final Bitmap e;
    public final int f;

    /* JADX WARN: Removed duplicated region for block: B:6:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(int i3, Context context, e6 e6Var) {
        super(context, e6Var);
        SparseIntArray sparseIntArray;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = i3;
        ArrayList arrayList2 = new ArrayList();
        hp s12 = hp.s1(h10.t0);
        if (i3 == 0) {
            arrayList2.add(new g(R.drawable.msg_stories_order, 20, bd.M0(2131746947, null), bd.M0(2131746946, null)));
            arrayList2.add(new g(R.drawable.msg_stories_stealth, 15, bd.M0(2131746941, null), bd.M0(2131746940, null)));
            arrayList2.add(new g(R.drawable.menu_quality_hd, 25, bd.M0(2131746945, null), bd.M0(2131746944, null)));
            arrayList2.add(new g(R.drawable.msg_stories_views, 16, bd.M0(2131746939, null), bd.M0(2131746938, null)));
            arrayList2.add(new g(R.drawable.msg_stories_timer, 17, bd.M0(2131746951, null), bd.M0(2131746950, null)));
            arrayList2.add(new g(R.drawable.msg_stories_save, 18, bd.M0(2131746943, null), bd.M0(2131746942, null)));
            arrayList2.add(new g(R.drawable.msg_stories_caption, 21, bd.M0(2131746953, null), bd.M0(2131746952, null)));
            arrayList2.add(new g(R.drawable.msg_stories_link, 19, bd.M0(2131746949, null), bd.M0(2131746948, null)));
        } else if (i3 == 1) {
            sparseIntArray = s12.P0;
            arrayList2.add(new g(R.drawable.menu_premium_location, 29, bd.M0(2131747061, null), bd.M0(2131747060, null)));
            arrayList2.add(new g(R.drawable.menu_premium_clock, 30, bd.M0(2131747059, null), bd.M0(2131747058, null)));
            arrayList2.add(new g(R.drawable.menu_quickreply, 31, bd.M0(2131747057, null), bd.M0(2131747056, null)));
            arrayList2.add(new g(R.drawable.menu_feature_status, 32, bd.M0(2131747065, null), bd.M0(2131747064, null)));
            arrayList2.add(new g(R.drawable.menu_premium_away, 33, bd.M0(2131747072, null), bd.M0(2131747071, null)));
            arrayList2.add(new g(R.drawable.menu_premium_chatbot, 34, bd.M0(2131747067, null), bd.M0(2131747066, null)));
            arrayList2.add(new g(R.drawable.menu_feature_intro, 36, bd.M0(2131747063, null), bd.M0(2131747062, null)));
            arrayList2.add(new g(R.drawable.menu_premium_chatlink, 37, bd.M0(2131747070, null), bd.M0(2131747069, null)));
            if (sparseIntArray != null) {
                Collections.sort(arrayList2, new y4(sparseIntArray, 5));
            }
            arrayList.add(new g(0));
            arrayList.addAll(arrayList2);
            arrayList.add(new g(2));
            Bitmap createBitmap = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
            this.e = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, createBitmap.getWidth(), 0.0f, new int[]{k6.x0(null, k6.zk, false), k6.x0(null, k6.Ak, false), k6.x0(null, k6.Bk, false), k6.x0(null, k6.Ck, false)}, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight(), paint);
        }
        sparseIntArray = null;
        if (sparseIntArray != null) {
        }
        arrayList.add(new g(0));
        arrayList.addAll(arrayList2);
        arrayList.add(new g(2));
        Bitmap createBitmap2 = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
        this.e = createBitmap2;
        Canvas canvas2 = new Canvas(createBitmap2);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 0.0f, createBitmap2.getWidth(), 0.0f, new int[]{k6.x0(null, k6.zk, false), k6.x0(null, k6.Ak, false), k6.x0(null, k6.Bk, false), k6.x0(null, k6.Ck, false)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, createBitmap2.getWidth(), createBitmap2.getHeight(), paint2);
    }

    @Override // vg.a
    public final u4.h0 a() {
        return new r4(this, 9);
    }
}
