// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r84 extends kg0 {
    public final ArrayList d;
    public final Bitmap e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r84(int i, wjb wjbVar, Context context) {
        super(context, wjbVar);
        SparseIntArray sparseIntArray;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = i;
        ArrayList arrayList2 = new ArrayList();
        na7 q1 = na7.q1(y6c.t0);
        if (i == 0) {
            arrayList2.add(new p84(R.drawable.msg_stories_order, 20, k96.M0(2131746748, null), k96.M0(2131746747, null)));
            arrayList2.add(new p84(R.drawable.msg_stories_stealth, 15, k96.M0(2131746742, null), k96.M0(2131746741, null)));
            arrayList2.add(new p84(R.drawable.menu_quality_hd, 25, k96.M0(2131746746, null), k96.M0(2131746745, null)));
            arrayList2.add(new p84(R.drawable.msg_stories_views, 16, k96.M0(2131746740, null), k96.M0(2131746739, null)));
            arrayList2.add(new p84(R.drawable.msg_stories_timer, 17, k96.M0(2131746752, null), k96.M0(2131746751, null)));
            arrayList2.add(new p84(R.drawable.msg_stories_save, 18, k96.M0(2131746744, null), k96.M0(2131746743, null)));
            arrayList2.add(new p84(R.drawable.msg_stories_caption, 21, k96.M0(2131746754, null), k96.M0(2131746753, null)));
            arrayList2.add(new p84(R.drawable.msg_stories_link, 19, k96.M0(2131746750, null), k96.M0(2131746749, null)));
        } else if (i == 1) {
            sparseIntArray = q1.F0;
            arrayList2.add(new p84(R.drawable.menu_premium_location, 29, k96.M0(2131746862, null), k96.M0(2131746861, null)));
            arrayList2.add(new p84(R.drawable.menu_premium_clock, 30, k96.M0(2131746860, null), k96.M0(2131746859, null)));
            arrayList2.add(new p84(R.drawable.menu_quickreply, 31, k96.M0(2131746858, null), k96.M0(2131746857, null)));
            arrayList2.add(new p84(R.drawable.menu_feature_status, 32, k96.M0(2131746866, null), k96.M0(2131746865, null)));
            arrayList2.add(new p84(R.drawable.menu_premium_away, 33, k96.M0(2131746873, null), k96.M0(2131746872, null)));
            arrayList2.add(new p84(R.drawable.menu_premium_chatbot, 34, k96.M0(2131746868, null), k96.M0(2131746867, null)));
            arrayList2.add(new p84(R.drawable.menu_feature_intro, 36, k96.M0(2131746864, null), k96.M0(2131746863, null)));
            arrayList2.add(new p84(R.drawable.menu_premium_chatlink, 37, k96.M0(2131746871, null), k96.M0(2131746870, null)));
            if (sparseIntArray != null) {
                Collections.sort(arrayList2, new bz0(sparseIntArray, (byte) 2));
            }
            arrayList.add(new p84(0));
            arrayList.addAll(arrayList2);
            arrayList.add(new p84(2));
            Bitmap createBitmap = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
            this.e = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, createBitmap.getWidth(), 0.0f, new int[]{bkb.w0(null, bkb.Bk, false), bkb.w0(null, bkb.Ck, false), bkb.w0(null, bkb.Dk, false), bkb.w0(null, bkb.Ek, false)}, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight(), paint);
        }
        sparseIntArray = null;
        if (sparseIntArray != null) {
        }
        arrayList.add(new p84(0));
        arrayList.addAll(arrayList2);
        arrayList.add(new p84(2));
        Bitmap createBitmap2 = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
        this.e = createBitmap2;
        Canvas canvas2 = new Canvas(createBitmap2);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 0.0f, createBitmap2.getWidth(), 0.0f, new int[]{bkb.w0(null, bkb.Bk, false), bkb.w0(null, bkb.Ck, false), bkb.w0(null, bkb.Dk, false), bkb.w0(null, bkb.Ek, false)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, createBitmap2.getWidth(), createBitmap2.getHeight(), paint2);
    }
}
