package ug;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.SparseIntArray;
import di.i4;
import di.p4;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i extends a {
    public final ArrayList d;
    public final Bitmap e;
    public final int f;

    /* JADX WARN: Removed duplicated region for block: B:6:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(int i7, Context context, e6 e6Var) {
        super(context, e6Var);
        SparseIntArray sparseIntArray;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = i7;
        ArrayList arrayList2 = new ArrayList();
        np s12 = np.s1(m10.t0);
        if (i7 == 0) {
            arrayList2.add(new g(R.drawable.msg_stories_order, 20, hd.M0(2131746939, null), hd.M0(2131746938, null)));
            arrayList2.add(new g(R.drawable.msg_stories_stealth, 15, hd.M0(2131746933, null), hd.M0(2131746932, null)));
            arrayList2.add(new g(R.drawable.menu_quality_hd, 25, hd.M0(2131746937, null), hd.M0(2131746936, null)));
            arrayList2.add(new g(R.drawable.msg_stories_views, 16, hd.M0(2131746931, null), hd.M0(2131746930, null)));
            arrayList2.add(new g(R.drawable.msg_stories_timer, 17, hd.M0(2131746943, null), hd.M0(2131746942, null)));
            arrayList2.add(new g(R.drawable.msg_stories_save, 18, hd.M0(2131746935, null), hd.M0(2131746934, null)));
            arrayList2.add(new g(R.drawable.msg_stories_caption, 21, hd.M0(2131746945, null), hd.M0(2131746944, null)));
            arrayList2.add(new g(R.drawable.msg_stories_link, 19, hd.M0(2131746941, null), hd.M0(2131746940, null)));
        } else if (i7 == 1) {
            sparseIntArray = s12.P0;
            arrayList2.add(new g(R.drawable.menu_premium_location, 29, hd.M0(2131747053, null), hd.M0(2131747052, null)));
            arrayList2.add(new g(R.drawable.menu_premium_clock, 30, hd.M0(2131747051, null), hd.M0(2131747050, null)));
            arrayList2.add(new g(R.drawable.menu_quickreply, 31, hd.M0(2131747049, null), hd.M0(2131747048, null)));
            arrayList2.add(new g(R.drawable.menu_feature_status, 32, hd.M0(2131747057, null), hd.M0(2131747056, null)));
            arrayList2.add(new g(R.drawable.menu_premium_away, 33, hd.M0(2131747064, null), hd.M0(2131747063, null)));
            arrayList2.add(new g(R.drawable.menu_premium_chatbot, 34, hd.M0(2131747059, null), hd.M0(2131747058, null)));
            arrayList2.add(new g(R.drawable.menu_feature_intro, 36, hd.M0(2131747055, null), hd.M0(2131747054, null)));
            arrayList2.add(new g(R.drawable.menu_premium_chatlink, 37, hd.M0(2131747062, null), hd.M0(2131747061, null)));
            if (sparseIntArray != null) {
                Collections.sort(arrayList2, new p4(sparseIntArray, 5));
            }
            arrayList.add(new g(0));
            arrayList.addAll(arrayList2);
            arrayList.add(new g(2));
            Bitmap createBitmap = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
            this.e = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, createBitmap.getWidth(), 0.0f, new int[]{j6.x0(null, j6.Ck, false), j6.x0(null, j6.Dk, false), j6.x0(null, j6.Ek, false), j6.x0(null, j6.Fk, false)}, (float[]) null, Shader.TileMode.CLAMP));
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
        paint2.setShader(new LinearGradient(0.0f, 0.0f, createBitmap2.getWidth(), 0.0f, new int[]{j6.x0(null, j6.Ck, false), j6.x0(null, j6.Dk, false), j6.x0(null, j6.Ek, false), j6.x0(null, j6.Fk, false)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, createBitmap2.getWidth(), createBitmap2.getHeight(), paint2);
    }

    @Override // ug.a
    public final v4.h0 a() {
        return new i4(this, 10);
    }
}
