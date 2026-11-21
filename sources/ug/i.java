package ug;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.SparseIntArray;
import di.l4;
import di.s4;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        mp u12 = mp.u1(j10.t0);
        if (i7 == 0) {
            arrayList2.add(new g(R.drawable.msg_stories_order, 20, gd.N0(2131746745, null), gd.N0(2131746744, null)));
            arrayList2.add(new g(R.drawable.msg_stories_stealth, 15, gd.N0(2131746739, null), gd.N0(2131746738, null)));
            arrayList2.add(new g(R.drawable.menu_quality_hd, 25, gd.N0(2131746743, null), gd.N0(2131746742, null)));
            arrayList2.add(new g(R.drawable.msg_stories_views, 16, gd.N0(2131746737, null), gd.N0(2131746736, null)));
            arrayList2.add(new g(R.drawable.msg_stories_timer, 17, gd.N0(2131746749, null), gd.N0(2131746748, null)));
            arrayList2.add(new g(R.drawable.msg_stories_save, 18, gd.N0(2131746741, null), gd.N0(2131746740, null)));
            arrayList2.add(new g(R.drawable.msg_stories_caption, 21, gd.N0(2131746751, null), gd.N0(2131746750, null)));
            arrayList2.add(new g(R.drawable.msg_stories_link, 19, gd.N0(2131746747, null), gd.N0(2131746746, null)));
        } else if (i7 == 1) {
            sparseIntArray = u12.P0;
            arrayList2.add(new g(R.drawable.menu_premium_location, 29, gd.N0(2131746859, null), gd.N0(2131746858, null)));
            arrayList2.add(new g(R.drawable.menu_premium_clock, 30, gd.N0(2131746857, null), gd.N0(2131746856, null)));
            arrayList2.add(new g(R.drawable.menu_quickreply, 31, gd.N0(2131746855, null), gd.N0(2131746854, null)));
            arrayList2.add(new g(R.drawable.menu_feature_status, 32, gd.N0(2131746863, null), gd.N0(2131746862, null)));
            arrayList2.add(new g(R.drawable.menu_premium_away, 33, gd.N0(2131746870, null), gd.N0(2131746869, null)));
            arrayList2.add(new g(R.drawable.menu_premium_chatbot, 34, gd.N0(2131746865, null), gd.N0(2131746864, null)));
            arrayList2.add(new g(R.drawable.menu_feature_intro, 36, gd.N0(2131746861, null), gd.N0(2131746860, null)));
            arrayList2.add(new g(R.drawable.menu_premium_chatlink, 37, gd.N0(2131746868, null), gd.N0(2131746867, null)));
            if (sparseIntArray != null) {
                Collections.sort(arrayList2, new s4(sparseIntArray, 5));
            }
            arrayList.add(new g(0));
            arrayList.addAll(arrayList2);
            arrayList.add(new g(2));
            Bitmap createBitmap = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
            this.e = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, createBitmap.getWidth(), 0.0f, new int[]{m6.x0(null, m6.Ck, false), m6.x0(null, m6.Dk, false), m6.x0(null, m6.Ek, false), m6.x0(null, m6.Fk, false)}, (float[]) null, Shader.TileMode.CLAMP));
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
        paint2.setShader(new LinearGradient(0.0f, 0.0f, createBitmap2.getWidth(), 0.0f, new int[]{m6.x0(null, m6.Ck, false), m6.x0(null, m6.Dk, false), m6.x0(null, m6.Ek, false), m6.x0(null, m6.Fk, false)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, createBitmap2.getWidth(), createBitmap2.getHeight(), paint2);
    }

    @Override // ug.a
    public final v4.i0 a() {
        return new l4(this, 10);
    }
}
