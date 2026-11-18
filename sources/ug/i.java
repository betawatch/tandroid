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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i extends a {
    public final ArrayList d;
    public final Bitmap e;
    public final int f;

    /* JADX WARN: Removed duplicated region for block: B:6:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(int i7, Context context, i6 i6Var) {
        super(context, i6Var);
        SparseIntArray sparseIntArray;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = i7;
        ArrayList arrayList2 = new ArrayList();
        mp u12 = mp.u1(j10.t0);
        if (i7 == 0) {
            arrayList2.add(new g(R.drawable.msg_stories_order, 20, gd.M0(2131746746, null), gd.M0(2131746745, null)));
            arrayList2.add(new g(R.drawable.msg_stories_stealth, 15, gd.M0(2131746740, null), gd.M0(2131746739, null)));
            arrayList2.add(new g(R.drawable.menu_quality_hd, 25, gd.M0(2131746744, null), gd.M0(2131746743, null)));
            arrayList2.add(new g(R.drawable.msg_stories_views, 16, gd.M0(2131746738, null), gd.M0(2131746737, null)));
            arrayList2.add(new g(R.drawable.msg_stories_timer, 17, gd.M0(2131746750, null), gd.M0(2131746749, null)));
            arrayList2.add(new g(R.drawable.msg_stories_save, 18, gd.M0(2131746742, null), gd.M0(2131746741, null)));
            arrayList2.add(new g(R.drawable.msg_stories_caption, 21, gd.M0(2131746752, null), gd.M0(2131746751, null)));
            arrayList2.add(new g(R.drawable.msg_stories_link, 19, gd.M0(2131746748, null), gd.M0(2131746747, null)));
        } else if (i7 == 1) {
            sparseIntArray = u12.P0;
            arrayList2.add(new g(R.drawable.menu_premium_location, 29, gd.M0(2131746860, null), gd.M0(2131746859, null)));
            arrayList2.add(new g(R.drawable.menu_premium_clock, 30, gd.M0(2131746858, null), gd.M0(2131746857, null)));
            arrayList2.add(new g(R.drawable.menu_quickreply, 31, gd.M0(2131746856, null), gd.M0(2131746855, null)));
            arrayList2.add(new g(R.drawable.menu_feature_status, 32, gd.M0(2131746864, null), gd.M0(2131746863, null)));
            arrayList2.add(new g(R.drawable.menu_premium_away, 33, gd.M0(2131746871, null), gd.M0(2131746870, null)));
            arrayList2.add(new g(R.drawable.menu_premium_chatbot, 34, gd.M0(2131746866, null), gd.M0(2131746865, null)));
            arrayList2.add(new g(R.drawable.menu_feature_intro, 36, gd.M0(2131746862, null), gd.M0(2131746861, null)));
            arrayList2.add(new g(R.drawable.menu_premium_chatlink, 37, gd.M0(2131746869, null), gd.M0(2131746868, null)));
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
            paint.setShader(new LinearGradient(0.0f, 0.0f, createBitmap.getWidth(), 0.0f, new int[]{n6.x0(null, n6.Ck, false), n6.x0(null, n6.Dk, false), n6.x0(null, n6.Ek, false), n6.x0(null, n6.Fk, false)}, (float[]) null, Shader.TileMode.CLAMP));
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
        paint2.setShader(new LinearGradient(0.0f, 0.0f, createBitmap2.getWidth(), 0.0f, new int[]{n6.x0(null, n6.Ck, false), n6.x0(null, n6.Dk, false), n6.x0(null, n6.Ek, false), n6.x0(null, n6.Fk, false)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, createBitmap2.getWidth(), createBitmap2.getHeight(), paint2);
    }

    @Override // ug.a
    public final v4.i0 a() {
        return new l4(this, 10);
    }
}
