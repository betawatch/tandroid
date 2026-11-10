package ug;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.SparseIntArray;
import bi.k5;
import bi.s5;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i extends a {
    public final ArrayList d;
    public final Bitmap e;
    public final int f;

    /* JADX WARN: Removed duplicated region for block: B:6:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(int i7, Context context, h6 h6Var) {
        super(context, h6Var);
        SparseIntArray sparseIntArray;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = i7;
        ArrayList arrayList2 = new ArrayList();
        qp s12 = qp.s1(p10.s0);
        if (i7 == 0) {
            arrayList2.add(new g(R.drawable.msg_stories_order, 20, id.M0(2131746939, null), id.M0(2131746938, null)));
            arrayList2.add(new g(R.drawable.msg_stories_stealth, 15, id.M0(2131746933, null), id.M0(2131746932, null)));
            arrayList2.add(new g(R.drawable.menu_quality_hd, 25, id.M0(2131746937, null), id.M0(2131746936, null)));
            arrayList2.add(new g(R.drawable.msg_stories_views, 16, id.M0(2131746931, null), id.M0(2131746930, null)));
            arrayList2.add(new g(R.drawable.msg_stories_timer, 17, id.M0(2131746943, null), id.M0(2131746942, null)));
            arrayList2.add(new g(R.drawable.msg_stories_save, 18, id.M0(2131746935, null), id.M0(2131746934, null)));
            arrayList2.add(new g(R.drawable.msg_stories_caption, 21, id.M0(2131746945, null), id.M0(2131746944, null)));
            arrayList2.add(new g(R.drawable.msg_stories_link, 19, id.M0(2131746941, null), id.M0(2131746940, null)));
        } else if (i7 == 1) {
            sparseIntArray = s12.O0;
            arrayList2.add(new g(R.drawable.menu_premium_location, 29, id.M0(2131747053, null), id.M0(2131747052, null)));
            arrayList2.add(new g(R.drawable.menu_premium_clock, 30, id.M0(2131747051, null), id.M0(2131747050, null)));
            arrayList2.add(new g(R.drawable.menu_quickreply, 31, id.M0(2131747049, null), id.M0(2131747048, null)));
            arrayList2.add(new g(R.drawable.menu_feature_status, 32, id.M0(2131747057, null), id.M0(2131747056, null)));
            arrayList2.add(new g(R.drawable.menu_premium_away, 33, id.M0(2131747064, null), id.M0(2131747063, null)));
            arrayList2.add(new g(R.drawable.menu_premium_chatbot, 34, id.M0(2131747059, null), id.M0(2131747058, null)));
            arrayList2.add(new g(R.drawable.menu_feature_intro, 36, id.M0(2131747055, null), id.M0(2131747054, null)));
            arrayList2.add(new g(R.drawable.menu_premium_chatlink, 37, id.M0(2131747062, null), id.M0(2131747061, null)));
            if (sparseIntArray != null) {
                Collections.sort(arrayList2, new s5(sparseIntArray, 7));
            }
            arrayList.add(new g(0));
            arrayList.addAll(arrayList2);
            arrayList.add(new g(2));
            Bitmap createBitmap = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
            this.e = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, createBitmap.getWidth(), 0.0f, new int[]{m6.x0(null, m6.zk, false), m6.x0(null, m6.Ak, false), m6.x0(null, m6.Bk, false), m6.x0(null, m6.Ck, false)}, (float[]) null, Shader.TileMode.CLAMP));
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
        paint2.setShader(new LinearGradient(0.0f, 0.0f, createBitmap2.getWidth(), 0.0f, new int[]{m6.x0(null, m6.zk, false), m6.x0(null, m6.Ak, false), m6.x0(null, m6.Bk, false), m6.x0(null, m6.Ck, false)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, createBitmap2.getWidth(), createBitmap2.getHeight(), paint2);
    }

    @Override // ug.a
    public final v4.g0 a() {
        return new k5(this, 10);
    }
}
