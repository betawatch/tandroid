package rg;

import ai.va;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.l8;
import ci.o3;
import ei.b4;
import ei.e6;
import ei.j5;
import ei.m5;
import ei.n5;
import ei.o4;
import ei.u4;
import ei.x4;
import ei.z4;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.yg;
import org.telegram.ui.it0;
import org.telegram.ui.rq0;
import w7.z5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class m0 extends kw0 implements q1, h, m1, iw0, NotificationCenter.NotificationCenterDelegate {
    public final f1 A0;
    public final TextView A1;
    public final j1 B0;
    public final Paint B1;
    public float C0;
    public final Paint C1;
    public final Bitmap D0;
    public float D1;
    public final Bitmap E0;
    public boolean E1;
    public final qg.v1 F0;
    public o1.k F1;
    public final DispatchQueue G0;
    public final i0 G1;
    public final MediaController.CropState H0;
    public final Paint H1;
    public float I0;
    public final Paint I1;
    public float J0;
    public final Paint J1;
    public float K0;
    public final qg.s1 K1;
    public float L0;
    public boolean L1;
    public float M0;
    public o1.k M1;
    public float N0;
    public float N1;
    public float O0;
    public final Paint O1;
    public boolean P0;
    public final int P1;
    public float Q0;
    public final fh.a Q1;
    public dw0 R0;
    public org.telegram.ui.ActionBar.m1 R1;
    public j S0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout S1;
    public boolean T0;
    public Rect T1;
    public int U0;
    public Runnable U1;
    public final boolean V0;
    public final qg.u0 V1;
    public final b0 W0;
    public boolean W1;
    public final d0 X0;
    public float X1;
    public final g0 Y0;
    public boolean Y1;
    public final f0 Z0;
    public final f6 Z1;
    public t11 a1;
    public final Paint a2;
    public final FrameLayout b1;
    public final Paint b2;
    public final j0 c1;
    public dh.d c2;
    public final h0 d1;
    public final float[] d2;
    public final FrameLayout e1;
    public final int[] e2;
    public m5 f1;
    public tz f2;
    public int g1;
    public boolean g2;
    public int h1;
    public boolean h2;
    public float i1;
    public boolean i2;
    public ValueAnimator j1;
    public int j2;
    public boolean k1;
    public int k2;
    public final w1 l1;
    public int l2;
    public final ki.t1 m1;
    public int m2;
    public ArrayList n1;
    public boolean n2;
    public final int o1;
    public BigInteger p1;
    public TextView q1;
    public TextView r1;
    public TextView s1;
    public final r1 t1;
    public final o1 u1;
    public final t1 v1;
    public final ImageView w1;
    public final LinearLayout x1;
    public final TextView y1;
    public final TextView z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23, types: [int] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r1v22, types: [rg.v2] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.view.View, rg.o2, rg.y] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Components.iw0, org.telegram.ui.Components.jw0, rg.m0, rg.m1, rg.q1] */
    public m0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, rq0 rq0Var, d6 d6Var) {
        super(context, activity);
        Emoji.EmojiSpan[] emojiSpanArr;
        x1 x1Var;
        ArrayList arrayList2 = arrayList;
        boolean z10 = false;
        this.g1 = 0;
        this.h1 = -1;
        final it0 it0Var = (it0) this;
        this.m1 = new ki.t1(it0Var, 24);
        byte b10 = 1;
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.H1 = new Paint(1);
        this.I1 = new Paint(1);
        this.J1 = new Paint(1);
        qg.s1 s1Var = new qg.s1(1.0f, 0.016773745f, -1);
        this.K1 = s1Var;
        this.O1 = new Paint(1);
        this.Y1 = false;
        this.Z1 = new f6((View) this, 350L, bs.h);
        this.a2 = new Paint(1);
        Paint paint = new Paint(1);
        this.b2 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.d2 = new float[2];
        this.e2 = new int[2];
        int i12 = 3;
        new p4.s0(it0Var, i12);
        setDelegate(this);
        this.P1 = i10;
        this.Q1 = new fh.a(i12, d6Var);
        this.H0 = cropState;
        this.V0 = context instanceof BubbleActivity;
        qg.u0 e = qg.u0.e(i10);
        this.V1 = e;
        e.i(0, true);
        s1Var.a = e.c();
        s1Var.c = e.i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.G0 = dispatchQueue;
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.o1 = i11;
        qg.v1 v1Var = new qg.v1();
        this.F0 = v1Var;
        v1Var.a = new qg.g0(it0Var, 7);
        byte b11 = 2;
        b0 b0Var = new b0(it0Var, context, new qg.s0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.W0 = b0Var;
        b0Var.setDelegate(new c0(it0Var, rq0Var));
        b0Var.setUndoStore(v1Var);
        b0Var.setQueue(dispatchQueue);
        b0Var.setVisibility(4);
        addView(b0Var, z5.e(-1, -1, 51));
        d0 d0Var = new d0(it0Var, context);
        this.X0 = d0Var;
        d0Var.setVisibility(4);
        addView(d0Var, z5.e(-1, -1, 51));
        f0 f0Var = new f0(it0Var, context, new e0(it0Var));
        this.Z0 = f0Var;
        addView(f0Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList2.get(i13);
                byte b12 = mediaEntity.type;
                if (b12 == 0) {
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z10);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    x1Var = i02;
                } else if (b12 == b10) {
                    ?? j02 = j0(z10);
                    j02.setType(mediaEntity.subType);
                    j02.setTypeface(mediaEntity.textTypeface);
                    j02.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                    int size2 = arrayList3.size();
                    for (?? r10 = z10; r10 < size2; r10++) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList3.get(r10);
                        a6 a6Var = new a6(emojiEntity.document_id, j02.getFontMetricsInt());
                        int i14 = emojiEntity.offset;
                        spannableString.setSpan(a6Var, i14, emojiEntity.length + i14, 33);
                        size2 = size2;
                    }
                    CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                    if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    j02.setText(replaceEmoji);
                    v0(j02, mediaEntity.textAlign);
                    qg.s1 swatch = j02.getSwatch();
                    swatch.a = mediaEntity.color;
                    j02.setSwatch(swatch);
                    x1Var = j02;
                } else {
                    byte b13 = b11;
                    if (b12 == b13) {
                        x1 h02 = h0(mediaEntity.text, false);
                        h02.B0 = false;
                        if ((mediaEntity.subType & b13) != 0) {
                            h02.r(false);
                        }
                        if ((mediaEntity.subType & 16) != 0) {
                            h02.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                        layoutParams2.width = mediaEntity.viewWidth;
                        layoutParams2.height = mediaEntity.viewHeight;
                        x1Var = h02;
                    } else {
                        i13++;
                        arrayList2 = arrayList;
                        z10 = false;
                        b10 = 1;
                        b11 = 2;
                    }
                }
                x1Var.setX((mediaEntity.x * this.R0.a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                x1Var.setY((mediaEntity.y * this.R0.b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                x1Var.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + x1Var.getX(), (mediaEntity.viewHeight / 2.0f) + x1Var.getY()));
                x1Var.setScale(mediaEntity.scale);
                x1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i13++;
                arrayList2 = arrayList;
                z10 = false;
                b10 = 1;
                b11 = 2;
            }
        }
        this.Z0.setVisibility(4);
        g0 g0Var = new g0(context);
        this.Y0 = g0Var;
        addView(g0Var);
        ?? frameLayout = new FrameLayout(context);
        this.b1 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, z5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.w1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(h6.g0(1090519039, 1, -1));
        final int i15 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: rg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        it0 it0Var2 = it0Var;
                        b0 b0Var2 = it0Var2.W0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof qg.l)) {
                            b0Var2.b();
                            it0Var2.t1.setSelectedIndex(1);
                            it0Var2.o((qg.m) qg.m.a.get(0));
                            break;
                        } else {
                            it0Var2.F0.c();
                            break;
                        }
                        break;
                    case 1:
                        it0 it0Var3 = it0Var;
                        b0 b0Var3 = it0Var3.W0;
                        qg.v1 v1Var2 = it0Var3.F0;
                        if (v1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof qg.l)) {
                                b0Var3.b();
                                it0Var3.t1.setSelectedIndex(1);
                                it0Var3.o((qg.m) qg.m.a.get(0));
                            }
                            b0Var3.a();
                            v1Var2.c.clear();
                            v1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(v1Var2, 7));
                            it0Var3.Z0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        it0 it0Var4 = it0Var;
                        j jVar = it0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (it0Var4.g2) {
                            it0Var4.m0(false);
                        }
                        it0Var4.r0(it0Var4.S0);
                        it0Var4.s0(null, true);
                        break;
                    default:
                        it0Var.s0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, z5.a(32.0f, 12.0f, 0.0f, 0.0f, 0.0f, 32, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.x1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(h6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        wh.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, z5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, z5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ah.f(25));
        frameLayout.addView(linearLayout, z5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.y1 = textView2;
        textView2.setBackground(h6.g0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i16 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: rg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        it0 it0Var2 = it0Var;
                        b0 b0Var2 = it0Var2.W0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof qg.l)) {
                            b0Var2.b();
                            it0Var2.t1.setSelectedIndex(1);
                            it0Var2.o((qg.m) qg.m.a.get(0));
                            break;
                        } else {
                            it0Var2.F0.c();
                            break;
                        }
                        break;
                    case 1:
                        it0 it0Var3 = it0Var;
                        b0 b0Var3 = it0Var3.W0;
                        qg.v1 v1Var2 = it0Var3.F0;
                        if (v1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof qg.l)) {
                                b0Var3.b();
                                it0Var3.t1.setSelectedIndex(1);
                                it0Var3.o((qg.m) qg.m.a.get(0));
                            }
                            b0Var3.a();
                            v1Var2.c.clear();
                            v1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(v1Var2, 7));
                            it0Var3.Z0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        it0 it0Var4 = it0Var;
                        j jVar = it0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (it0Var4.g2) {
                            it0Var4.m0(false);
                        }
                        it0Var4.r0(it0Var4.S0);
                        it0Var4.s0(null, true);
                        break;
                    default:
                        it0Var.s0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView k10 = org.telegram.ui.Cells.t0.k(frameLayout, textView2, z5.a(32.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5), context);
        this.z1 = k10;
        k10.setBackground(h6.g0(822083583, 7, -1));
        k10.setPadding(org.telegram.ui.Cells.t0.f(8.0f, R.string.Clear, k10), 0, AndroidUtilities.dp(8.0f), 0);
        k10.setGravity(16);
        k10.setTextColor(-1);
        k10.setTypeface(AndroidUtilities.bold());
        k10.setTextSize(1, 16.0f);
        final int i17 = 2;
        k10.setOnClickListener(new View.OnClickListener() { // from class: rg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        it0 it0Var2 = it0Var;
                        b0 b0Var2 = it0Var2.W0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof qg.l)) {
                            b0Var2.b();
                            it0Var2.t1.setSelectedIndex(1);
                            it0Var2.o((qg.m) qg.m.a.get(0));
                            break;
                        } else {
                            it0Var2.F0.c();
                            break;
                        }
                        break;
                    case 1:
                        it0 it0Var3 = it0Var;
                        b0 b0Var3 = it0Var3.W0;
                        qg.v1 v1Var2 = it0Var3.F0;
                        if (v1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof qg.l)) {
                                b0Var3.b();
                                it0Var3.t1.setSelectedIndex(1);
                                it0Var3.o((qg.m) qg.m.a.get(0));
                            }
                            b0Var3.a();
                            v1Var2.c.clear();
                            v1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(v1Var2, 7));
                            it0Var3.Z0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        it0 it0Var4 = it0Var;
                        j jVar = it0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (it0Var4.g2) {
                            it0Var4.m0(false);
                        }
                        it0Var4.r0(it0Var4.S0);
                        it0Var4.s0(null, true);
                        break;
                    default:
                        it0Var.s0(null, true);
                        break;
                }
            }
        });
        k10.setAlpha(0.0f);
        k10.setVisibility(8);
        TextView k11 = org.telegram.ui.Cells.t0.k(frameLayout, k10, z5.a(32.0f, 4.0f, 0.0f, 0.0f, 0.0f, -2, 51), context);
        this.A1 = k11;
        k11.setBackground(h6.g0(822083583, 7, -1));
        k11.setPadding(org.telegram.ui.Cells.t0.f(8.0f, R.string.Done, k11), 0, AndroidUtilities.dp(8.0f), 0);
        k11.setGravity(16);
        k11.setTextColor(-1);
        k11.setTypeface(AndroidUtilities.bold());
        k11.setTextSize(1, 16.0f);
        final int i18 = 3;
        k11.setOnClickListener(new View.OnClickListener() { // from class: rg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        it0 it0Var2 = it0Var;
                        b0 b0Var2 = it0Var2.W0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof qg.l)) {
                            b0Var2.b();
                            it0Var2.t1.setSelectedIndex(1);
                            it0Var2.o((qg.m) qg.m.a.get(0));
                            break;
                        } else {
                            it0Var2.F0.c();
                            break;
                        }
                        break;
                    case 1:
                        it0 it0Var3 = it0Var;
                        b0 b0Var3 = it0Var3.W0;
                        qg.v1 v1Var2 = it0Var3.F0;
                        if (v1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof qg.l)) {
                                b0Var3.b();
                                it0Var3.t1.setSelectedIndex(1);
                                it0Var3.o((qg.m) qg.m.a.get(0));
                            }
                            b0Var3.a();
                            v1Var2.c.clear();
                            v1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(v1Var2, 7));
                            it0Var3.Z0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        it0 it0Var4 = it0Var;
                        j jVar = it0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (it0Var4.g2) {
                            it0Var4.m0(false);
                        }
                        it0Var4.r0(it0Var4.S0);
                        it0Var4.s0(null, true);
                        break;
                    default:
                        it0Var.s0(null, true);
                        break;
                }
            }
        });
        k11.setAlpha(0.0f);
        k11.setVisibility(8);
        frameLayout.addView(k11, z5.a(32.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5));
        j0 j0Var = new j0(it0Var, context);
        this.c1 = j0Var;
        j0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        j0Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(j0Var, z5.e(-1, 104, 80));
        r1 r1Var = new r1(context, bitmap2 != null);
        this.t1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        j0Var.addView(r1Var, z5.d(48.0f, -1));
        o1 o1Var = new o1(context);
        this.u1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        o1Var.setAlignment(qg.u0.e(i10).g);
        j0Var.addView(o1Var, z5.d(48.0f, -1));
        h0 h0Var = new h0(it0Var, context);
        this.d1 = h0Var;
        addView(h0Var, z5.d(-1.0f, -1));
        t1 t1Var = new t1(context);
        this.v1 = t1Var;
        t1Var.setVisibility(8);
        t1Var.setOnItemClickListener(new va(it0Var, 18));
        o1Var.setTypefaceListView(t1Var);
        h0Var.addView(t1Var, z5.a(-2.0f, 0.0f, 0.0f, 8.0f, 8.0f, -2, 85));
        Paint paint2 = this.B1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.B1.setColor(1728053247);
        this.B1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.C1.setColor(h6.w0(h6.G8, this.Q1));
        i0 i0Var = new i0(it0Var, context);
        this.G1 = i0Var;
        i0Var.setVisibility(8);
        i0Var.setColorPalette(qg.u0.e(i10));
        i0Var.setColorListener(new m(it0Var, 0));
        j0Var.addView(i0Var, z5.a(84.0f, 56.0f, 0.0f, 56.0f, 6.0f, -1, 48));
        setupTabsLayout(context);
        f1 f1Var = new f1(context);
        this.A0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(h6.g0(1090519039, 1, -1));
        j0Var.addView(f1Var, z5.a(32.0f, 12.0f, 0.0f, 0.0f, 4.0f, 32, 83));
        j1 j1Var = new j1(context);
        this.B0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(h6.g0(1090519039, 1, -1));
        j1Var.setOnClickListener(new m41(it0Var, context, bitmap2, 2));
        j0Var.addView(j1Var, z5.a(32.0f, 0.0f, 0.0f, 12.0f, 4.0f, 32, 85));
        w1 w1Var = new w1(context);
        this.l1 = w1Var;
        w1Var.setColorSwatch(this.K1);
        w1Var.setRenderView(this.W0);
        w1Var.setValueOverride(this.m1);
        this.K1.c = this.m1.get();
        w1Var.setOnUpdate(new org.telegram.ui.Wallet.j(it0Var, i10, 7));
        addView(w1Var, z5.d(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e1 = frameLayout2;
        addView(frameLayout2, z5.d(-1.0f, -1));
        this.J1.setStyle(style);
        this.J1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        t0(this.K1, null);
        o((qg.m) qg.m.a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static /* synthetic */ void Z(it0 it0Var, Integer num) {
        it0Var.setNewColor(num.intValue());
        it0Var.x0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[Catch: all -> 0x002c, Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:4:0x0003, B:6:0x0022, B:8:0x0026, B:12:0x0036, B:14:0x005b, B:17:0x0062, B:18:0x0069, B:21:0x006e, B:22:0x0078, B:24:0x007e, B:26:0x0092, B:30:0x009c, B:34:0x00a8, B:36:0x00ab, B:41:0x00ae, B:46:0x00b5), top: B:3:0x0003, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(m0 m0Var) {
        qg.v0 v0Var;
        boolean z10;
        Bitmap bitmap = m0Var.E0;
        t8.b bVar = null;
        try {
            try {
                af.d dVar = new af.d(m0Var.getContext());
                dVar.c(1);
                dVar.b(1);
                dVar.b = false;
                bVar = dVar.a();
                if (!bVar.c.k()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    bVar.X0();
                    return;
                }
                g3 g3Var = new g3(22);
                a3.l lVar = (a3.l) g3Var.b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                g3Var.d = bitmap;
                lVar.a = width;
                lVar.b = height;
                lVar.c = m0Var.getFrameRotation();
                if (((ByteBuffer) g3Var.c) == null && ((Bitmap) g3Var.d) == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                try {
                    SparseArray e12 = bVar.e1(g3Var);
                    ArrayList arrayList = new ArrayList();
                    dw0 paintingSize = m0Var.getPaintingSize();
                    for (int i10 = 0; i10 < e12.size(); i10++) {
                        t8.a aVar = (t8.a) e12.get(e12.keyAt(i10));
                        int i11 = m0Var.o1;
                        if (i11 % 360 != 90 && i11 % 360 != 270) {
                            z10 = false;
                            v0Var = new qg.v0(aVar, bitmap, paintingSize, z10);
                            if (!(v0Var.d == null)) {
                                arrayList.add(v0Var);
                            }
                        }
                        z10 = true;
                        v0Var = new qg.v0(aVar, bitmap, paintingSize, z10);
                        if (!(v0Var.d == null)) {
                        }
                    }
                    m0Var.n1 = arrayList;
                    bVar.X0();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    bVar.X0();
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (0 == 0) {
                }
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                bVar.X0();
            }
            throw th3;
        }
    }

    public static void b0(m0 m0Var) {
        j jVar;
        f0 f0Var = m0Var.Z0;
        j jVar2 = m0Var.S0;
        if (jVar2 != null) {
            PointF B0 = m0Var.B0(jVar2);
            j jVar3 = m0Var.S0;
            if (jVar3 instanceof o2) {
                o2 o2Var = new o2(m0Var.getContext(), (o2) m0Var.S0, B0);
                o2Var.setDelegate(m0Var);
                f0Var.addView(o2Var);
                jVar = o2Var;
            } else if (jVar3 instanceof v2) {
                v2 v2Var = new v2(m0Var.getContext(), (v2) m0Var.S0, B0);
                v2Var.setDelegate(m0Var);
                v2Var.setMaxWidth((int) (m0Var.getPaintingSize().a - 20.0f));
                f0Var.addView(v2Var, z5.d(-2.0f, -2));
                jVar = v2Var;
            } else {
                jVar = null;
            }
            m0Var.q0(jVar);
            m0Var.s0(jVar, true);
        }
        org.telegram.ui.ActionBar.m1 m1Var = m0Var.R1;
        if (m1Var == null || !m1Var.isShowing()) {
            return;
        }
        m0Var.R1.d(true);
    }

    public static void c0(it0 it0Var, Integer num) {
        qg.u0 u0Var = it0Var.V1;
        u0Var.h(num.intValue(), true);
        u0Var.g();
        it0Var.setNewColor(num.intValue());
        i0 i0Var = it0Var.G1;
        i0Var.setSelectedColorIndex(u0Var.d());
        i0Var.getAdapter().l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.g1 == 2 ? this.u1 : this.t1;
    }

    private int getFrameRotation() {
        int i10 = this.o1;
        if (i10 == 90) {
            return 1;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 3;
        }
        return 2;
    }

    private dw0 getPaintingSize() {
        dw0 dw0Var = this.R0;
        if (dw0Var != null) {
            return dw0Var;
        }
        Bitmap bitmap = this.D0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        int i10 = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
        dw0 dw0Var2 = new dw0(width, height);
        float f7 = i10;
        dw0Var2.a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        dw0Var2.b = floor;
        if (floor > f7) {
            dw0Var2.b = f7;
            dw0Var2.a = (float) Math.floor((f7 * width) / height);
        }
        this.R0 = dw0Var2;
        return dw0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i10) {
        qg.s1 s1Var = this.K1;
        int i11 = s1Var.a;
        s1Var.a = i10;
        t0(s1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new u4(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.U0 = i10;
        j jVar = this.S0;
        if (jVar instanceof v2) {
            ((v2) jVar).setType(i10);
        }
        qg.u0 e = qg.u0.e(this.P1);
        e.h = i10;
        e.a.edit().putInt("text_type", i10).apply();
        this.u1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        m5 m5Var = new m5(this, context);
        this.f1 = m5Var;
        m5Var.setClipToPadding(false);
        this.f1.setOrientation(0);
        this.c1.addView(this.f1, z5.a(40.0f, 52.0f, 0.0f, 52.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        this.q1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.q1;
        int i10 = h6.i6;
        fh.a aVar = this.Q1;
        textView2.setBackground(h6.g0(h6.w0(i10, aVar), 7, -1));
        this.q1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.q1.setTextColor(-1);
        this.q1.setTextSize(1, 14.0f);
        this.q1.setGravity(1);
        this.q1.setTypeface(AndroidUtilities.bold());
        this.q1.setSingleLine();
        this.q1.setOnClickListener(new k(this, 0));
        this.f1.addView(this.q1, z5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.r1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.r1.setBackground(h6.g0(h6.w0(i10, aVar), 7, -1));
        this.r1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.r1.setOnClickListener(new k(this, 1));
        this.r1.setTextColor(-1);
        this.r1.setTextSize(1, 14.0f);
        this.r1.setGravity(1);
        this.r1.setTypeface(AndroidUtilities.bold());
        this.r1.setAlpha(0.6f);
        this.r1.setSingleLine();
        this.f1.addView(this.r1, z5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.s1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.s1.setBackground(h6.g0(h6.w0(i10, aVar), 7, -1));
        this.s1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.s1.setTextColor(-1);
        this.s1.setTextSize(1, 14.0f);
        this.s1.setGravity(1);
        this.s1.setTypeface(AndroidUtilities.bold());
        this.s1.setAlpha(0.6f);
        this.s1.setSingleLine();
        this.s1.setOnClickListener(new k(this, 4));
        this.f1.addView(this.s1, z5.l(1.0f, 0, -2));
    }

    public static void v0(v2 v2Var, int i10) {
        v2Var.setAlign(i10);
        int i11 = 2;
        v2Var.getEditText().setGravity(i10 != 1 ? i10 != 2 ? 19 : 21 : 17);
        if (i10 == 1) {
            i11 = 4;
        } else if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i11 = 3;
        }
        v2Var.getEditText().setTextAlignment(i11);
    }

    @Override // rg.q1
    public final void A() {
        z0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final void A0(boolean z10) {
        if (this.E1 != z10) {
            this.E1 = z10;
            o1.k kVar = this.F1;
            if (kVar != null) {
                kVar.c();
            }
            o1.k kVar2 = new o1.k(new o1.j(z10 ? 0.0f : 1000.0f));
            this.F1 = kVar2;
            o1.l lVar = new o1.l();
            lVar.i = z10 ? 1000.0f : 0.0f;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.u = lVar;
            if (z10) {
                t1 t1Var = this.v1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.F1.b(new l8(3, this));
            this.F1.a(new r(this, z10, 0));
            this.F1.h();
        }
    }

    public final PointF B0(j jVar) {
        MediaController.CropState cropState = this.H0;
        float f7 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f7, position.y + f7);
        }
        float f10 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF g02 = g0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                f0 f0Var = this.Z0;
                if (i10 >= f0Var.getChildCount()) {
                    break;
                }
                View childAt = f0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - g02.y, 2.0d) + Math.pow(position2.x - g02.x, 2.0d))) < f10) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return g02;
            }
            g02 = new PointF(g02.x + f7, g02.y + f7);
        }
    }

    public final void C0(int i10) {
        if (this.g1 == i10 || this.h1 == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = this.g1;
        ViewGroup viewGroup = this.u1;
        ViewGroup viewGroup2 = this.t1;
        ViewGroup viewGroup3 = i11 == 0 ? viewGroup2 : i11 == 2 ? viewGroup : null;
        this.h1 = i10;
        ViewGroup viewGroup4 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        int i12 = this.P1;
        qg.u0 e = qg.u0.e(i12);
        boolean z10 = i10 == 2;
        if (e.l != z10) {
            e.l = z10;
            if (z10) {
                e.i(-1, false);
            } else {
                e.i(e.a.getInt("brush", 0), false);
            }
        }
        int c10 = qg.u0.e(i12).c();
        qg.s1 s1Var = this.K1;
        s1Var.a = c10;
        t0(s1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.j1 = duration;
        duration.setInterpolator(bs.f);
        this.j1.addUpdateListener(new o3(this, viewGroup3, viewGroup4, 4));
        this.j1.addListener(new n5(this, viewGroup3, viewGroup4, i10, 2));
        this.j1.start();
    }

    @Override // rg.m1
    public final void D() {
        A0(true);
    }

    public final void D0() {
        int i10 = 0;
        while (true) {
            f0 f0Var = this.Z0;
            if (i10 >= f0Var.getChildCount()) {
                return;
            }
            View childAt = f0Var.getChildAt(i10);
            if (childAt != this.S0) {
                if (childAt instanceof j) {
                    j jVar = (j) childAt;
                    if (!jVar.l0 && jVar.j0 <= 0.0f) {
                    }
                }
                i10++;
            }
            ((j) childAt).m();
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.iw0
    public final void H(int i10, boolean z10) {
        boolean z11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.h2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.l2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.l2).commit();
            } else {
                this.k2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.k2).commit();
            }
        }
        if (this.g2) {
            int i11 = z10 ? this.l2 : this.k2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.f2.setLayoutParams(layoutParams);
                this.j2 = layoutParams.height;
                requestLayout();
                b4 b4Var = ((it0) this).o2.K1;
                if (b4Var != null) {
                    b4Var.a();
                }
                getHeight();
            }
        }
        if (this.m2 == i10 && this.n2 == z10) {
            getHeight();
            return;
        }
        this.m2 = i10;
        this.n2 = z10;
        boolean z12 = this.h2;
        j jVar = this.S0;
        if (jVar instanceof v2) {
            this.h2 = ((v2) jVar).getEditText().isFocused() && i10 > 0;
        } else {
            this.h2 = false;
        }
        if (this.h2 && this.g2) {
            y0(0);
        }
        if (this.j2 != 0 && !(z11 = this.h2) && z11 != z12 && !this.g2) {
            this.j2 = 0;
            requestLayout();
            b4 b4Var2 = ((it0) this).o2.K1;
            if (b4Var2 != null) {
                b4Var2.a();
            }
        }
        getHeight();
    }

    @Override // rg.q1, rg.m1
    public final void a() {
        x0(true);
    }

    @Override // rg.m1
    public final void c() {
        setTextType((this.U0 + 1) % 4);
    }

    @Override // org.telegram.ui.Components.jw0, org.telegram.ui.ActionBar.y5
    public final void d() {
        this.O1.setColor(-15132391);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f0 f0Var;
        v2 v2Var;
        String str;
        if (i10 != NotificationCenter.customTypefacesLoaded || (f0Var = this.Z0) == null) {
            return;
        }
        for (int i12 = 0; i12 < f0Var.getChildCount(); i12++) {
            View childAt = f0Var.getChildAt(i12);
            if ((childAt instanceof v2) && (str = (v2Var = (v2) childAt).A0) != null) {
                v2Var.setTypeface(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i10;
        g0 g0Var;
        f0 f0Var = this.Z0;
        if (view == f0Var) {
            float e = this.Z1.e(this.W1);
            if (e > 0.0f) {
                float dp = AndroidUtilities.dp(24.0f * e);
                int m12 = h6.m1(e, 1090519039);
                Paint paint = this.a2;
                paint.setShadowLayer(dp, 0.0f, 0.0f, m12);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(f0Var.getX(), f0Var.getY());
                canvas.scale(f0Var.getScaleX(), f0Var.getScaleY(), f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, f0Var.getWidth(), f0Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, f0Var.getWidth(), f0Var.getHeight(), this.b2);
                canvas.restore();
                if ((view != this.W0 || view == this.X0 || ((view == f0Var && f0Var.getClipChildren()) || (view == (g0Var = this.Y0) && g0Var.getClipChildren()))) && (cropState = this.H0) != null) {
                    canvas.save();
                    r10 = this.V0 ? 0 : AndroidUtilities.statusBarHeight;
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r10;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    i10 = cropState.transformRotation;
                    if (i10 != 90 || i10 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
                    int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
                    float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.L0;
                    float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.j2) - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r10 + this.M0;
                    canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
                    r10 = 1;
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (r10 != 0) {
                    canvas.restore();
                }
                return drawChild;
            }
        }
        if (view != this.W0) {
        }
        canvas.save();
        if (this.V0) {
        }
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r10;
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        i10 = cropState.transformRotation;
        if (i10 != 90) {
        }
        measuredHeight2 = measuredWidth2;
        measuredWidth2 = measuredHeight2;
        int scaleX2 = (int) ((view.getScaleX() * (measuredWidth2 * cropState.cropPw)) / cropState.cropScale);
        int scaleY2 = (int) ((view.getScaleY() * (measuredHeight2 * cropState.cropPh)) / cropState.cropScale);
        float ceil2 = ((float) Math.ceil((getMeasuredWidth() - scaleX2) / 2.0f)) + this.L0;
        float additionalBottom2 = (((getAdditionalBottom() + (((getMeasuredHeight() - this.j2) - currentActionBarHeight2) - AndroidUtilities.dp(48.0f))) - scaleY2) / 2.0f) + AndroidUtilities.dp(8.0f) + r10 + this.M0;
        canvas.clipRect(Math.max(0.0f, ceil2), Math.max(0.0f, additionalBottom2), Math.min(ceil2 + scaleX2, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom2 + scaleY2));
        r10 = 1;
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        if (r10 != 0) {
        }
        return drawChild2;
    }

    @Override // rg.m1
    public final void e(int i10) {
        j jVar = this.S0;
        if (jVar instanceof v2) {
            v0((v2) jVar, i10);
            qg.u0 e = qg.u0.e(this.P1);
            e.g = i10;
            e.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new p2.b(12, this, (x1) view)).start();
    }

    public final PointF g0() {
        dw0 paintingSize = getPaintingSize();
        float f7 = paintingSize.a / 2.0f;
        float f10 = paintingSize.b / 2.0f;
        if (this.H0 != null) {
            double radians = (float) Math.toRadians(-(r2.transformRotation + r2.cropRotate));
            float cos = (float) ((Math.cos(radians) * r2.cropPx) - (Math.sin(radians) * r2.cropPy));
            float f11 = (float) i0.a.f(radians, r2.cropPy, Math.sin(radians) * r2.cropPx);
            f7 -= cos * paintingSize.a;
            f10 -= f11 * paintingSize.b;
        }
        return new PointF(f7, f10);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.A0;
    }

    @Override // org.telegram.ui.Components.kw0, org.telegram.ui.Components.jw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.B0;
    }

    public long getLcm() {
        return this.p1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        a6[] a6VarArr;
        f0 f0Var = this.Z0;
        int childCount = f0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = f0Var.getChildAt(i10);
            if (childAt instanceof o2) {
                TLRPC.Document sticker = ((o2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof v2) {
                CharSequence text = ((v2) childAt).getText();
                if ((text instanceof Spanned) && (a6VarArr = (a6[]) ((Spanned) text).getSpans(0, text.length(), a6.class)) != null) {
                    for (a6 a6Var : a6VarArr) {
                        if (a6Var != null) {
                            TLRPC.Document document = a6Var.document;
                            if (document == null) {
                                document = r5.f(this.P1, a6Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = document.id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return this.C0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public qg.e1 getRenderView() {
        return this.W0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.S0;
        f0 f0Var = this.Z0;
        if (jVar == null) {
            return getY() + f0Var.getMeasuredHeight();
        }
        jVar.getLocationInWindow(new int[2]);
        return (f0Var.getScaleY() * this.S0.getHeight()) + r2[1];
    }

    public t11 getThanosEffect() {
        if (!t11.c()) {
            return null;
        }
        if (this.a1 == null) {
            t11 t11Var = new t11(getContext(), new n(this, 0));
            this.a1 = t11Var;
            addView(t11Var);
        }
        return this.a1;
    }

    @Override // rg.h
    public final void h(j jVar) {
        int[] k02 = k0(jVar);
        z0(new s(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    public final x1 h0(String str, boolean z10) {
        float f7;
        dw0 dw0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        f0 f0Var = this.Z0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(f0Var.getMeasuredWidth() * 0.5d);
            dw0Var = new dw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(f0Var.getMeasuredHeight() * 0.5d);
            dw0Var = new dw0(f7 * floor2, floor2);
        }
        dw0 dw0Var2 = dw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = dw0Var2.a;
            dw0Var2.a = dw0Var2.b;
            dw0Var2.b = f10;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        x1 x1Var = new x1(context, g02, dw0Var2, str, intValue);
        x1Var.setDelegate(this);
        f0Var.addView(x1Var);
        if (z10) {
            q0(x1Var);
            s0(x1Var, true);
        }
        return x1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y i0(Object obj, TLRPC.Document document, boolean z10) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f7;
        e6 e6Var;
        double d;
        e6 e6Var2;
        PointF pointF;
        boolean isTextColorEmoji;
        ArrayList arrayList;
        qg.v0 v0Var;
        e6 e6Var3;
        int i10;
        float f10;
        int i11 = 0;
        while (true) {
            if (i11 >= document.attributes.size()) {
                tL_maskCoords = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                tL_maskCoords = documentAttribute.mask_coords;
                break;
            }
            i11++;
        }
        float f11 = 0.75f;
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            f7 = -(cropState.transformRotation + cropState.cropRotate);
            f11 = 0.75f / cropState.cropScale;
        } else {
            f7 = 0.0f;
        }
        e6 e6Var4 = new e6(g0(), f11, f7);
        f0 f0Var = this.Z0;
        if (tL_maskCoords == null || (arrayList = this.n1) == null || arrayList.size() == 0) {
            e6Var = e6Var4;
            d = 0.5d;
        } else {
            int i12 = tL_maskCoords.n;
            long j10 = document.id;
            if (i12 >= 0 && i12 <= 3 && !this.n1.isEmpty()) {
                int size = this.n1.size();
                int nextInt = Utilities.random.nextInt(size);
                int i13 = size;
                loop1: while (i13 > 0) {
                    qg.v0 v0Var2 = (qg.v0) this.n1.get(nextInt);
                    if (v0Var2.a(i12) != null) {
                        d = 0.5d;
                        float f12 = v0Var2.a * 1.1f;
                        int i14 = 0;
                        while (i14 < f0Var.getChildCount()) {
                            View childAt = f0Var.getChildAt(i14);
                            qg.v0 v0Var3 = v0Var2;
                            if (childAt instanceof o2) {
                                o2 o2Var = (o2) childAt;
                                if (o2Var.getAnchor() == i12) {
                                    PointF position = o2Var.getPosition();
                                    e6Var3 = e6Var4;
                                    i10 = size;
                                    f10 = f12;
                                    float hypot = (float) Math.hypot(position.x - r4.x, position.y - r4.y);
                                    if ((j10 == o2Var.getSticker().id || this.n1.size() > 1) && hypot < f10) {
                                        break;
                                    }
                                    i14++;
                                    v0Var2 = v0Var3;
                                    e6Var4 = e6Var3;
                                    size = i10;
                                    f12 = f10;
                                }
                            }
                            e6Var3 = e6Var4;
                            i10 = size;
                            f10 = f12;
                            i14++;
                            v0Var2 = v0Var3;
                            e6Var4 = e6Var3;
                            size = i10;
                            f12 = f10;
                        }
                        e6Var = e6Var4;
                        v0Var = v0Var2;
                        break loop1;
                    }
                    e6Var3 = e6Var4;
                    i10 = size;
                    nextInt = (nextInt + 1) % i10;
                    i13--;
                    e6Var4 = e6Var3;
                    size = i10;
                }
            }
            e6Var = e6Var4;
            d = 0.5d;
            v0Var = null;
            if (v0Var != null) {
                PointF a2 = v0Var.a(i12);
                float f13 = i12 == 1 ? v0Var.e : v0Var.a;
                float f14 = v0Var.b;
                float floor = (float) ((f13 / ((float) Math.floor(getPaintingSize().a * d))) * tL_maskCoords.zoom);
                double radians = (float) Math.toRadians(f14);
                double d10 = 1.5707963267948966d - radians;
                double d11 = f13;
                float sin = (float) (Math.sin(d10) * d11 * tL_maskCoords.x);
                float cos = (float) (Math.cos(d10) * d11 * tL_maskCoords.x);
                double d12 = radians + 1.5707963267948966d;
                e6Var2 = new e6(new PointF(a2.x + sin + ((float) (Math.cos(d12) * d11 * tL_maskCoords.y)), a2.y + cos + ((float) (Math.sin(d12) * d11 * tL_maskCoords.y))), floor, f14);
                Context context = getContext();
                float floor2 = (float) Math.floor(getPaintingSize().a * d);
                dw0 dw0Var = new dw0(floor2, floor2);
                pointF = e6Var2.a;
                y yVar = new y(this, context, pointF, e6Var2.c, e6Var2.b, dw0Var, document, obj);
                isTextColorEmoji = MessageObject.isTextColorEmoji(document);
                ImageReceiver imageReceiver = yVar.x0;
                if (isTextColorEmoji) {
                    imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                imageReceiver.setLayerNum(12);
                if (pointF.x == f0Var.getMeasuredWidth() / 2.0f) {
                    yVar.setStickyX(2);
                }
                if (pointF.y == f0Var.getMeasuredHeight() / 2.0f) {
                    yVar.setStickyY(2);
                }
                yVar.setDelegate(this);
                f0Var.addView(yVar);
                if (z10) {
                    q0(yVar);
                    s0(yVar, true);
                }
                return yVar;
            }
        }
        e6Var2 = e6Var;
        Context context2 = getContext();
        float floor22 = (float) Math.floor(getPaintingSize().a * d);
        dw0 dw0Var2 = new dw0(floor22, floor22);
        pointF = e6Var2.a;
        y yVar2 = new y(this, context2, pointF, e6Var2.c, e6Var2.b, dw0Var2, document, obj);
        isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver2 = yVar2.x0;
        if (isTextColorEmoji) {
        }
        imageReceiver2.setLayerNum(12);
        if (pointF.x == f0Var.getMeasuredWidth() / 2.0f) {
        }
        if (pointF.y == f0Var.getMeasuredHeight() / 2.0f) {
        }
        yVar2.setDelegate(this);
        f0Var.addView(yVar2);
        if (z10) {
        }
        return yVar2;
    }

    public final v2 j0(boolean z10) {
        ((it0) this).o2.g0.isFocusable();
        dw0 paintingSize = getPaintingSize();
        PointF B0 = B0(null);
        v2 v2Var = new v2(getContext(), B0, (int) (paintingSize.a / 9.0f), "", this.K1, this.U0);
        float f7 = paintingSize.a / 9.0f;
        n nVar = new n(this, 2);
        v2Var.w0 = (int) (0.5f * f7);
        v2Var.x0 = (int) (f7 * 2.0f);
        v2Var.y0 = nVar;
        float f10 = B0.x;
        f0 f0Var = this.Z0;
        if (f10 == f0Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (B0.y == f0Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i10 = this.P1;
        v2Var.setTypeface(qg.u0.e(i10).j);
        v2Var.setType(qg.u0.e(i10).h);
        f0Var.addView(v2Var, z5.d(-2.0f, -2));
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            v2Var.j(1.0f / cropState.cropScale);
            v2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            q0(v2Var);
            v2Var.q();
            s0(v2Var, false);
            v2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(v2Var.getFocusedView());
            this.T0 = true;
            int i11 = qg.u0.e(i10).g;
            o1 o1Var = this.u1;
            o1Var.d(i11, true);
            o1Var.setOutlineType(qg.u0.e(i10).h);
        }
        return v2Var;
    }

    public final int[] k0(j jVar) {
        float[] fArr = this.d2;
        fArr[0] = jVar.getWidth() / 2.0f;
        fArr[1] = jVar.getHeight() / 2.0f;
        jVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + jVar.getLeft();
        fArr[1] = fArr[1] + jVar.getTop();
        Object parent = jVar.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int round = Math.round(fArr[0]);
        int[] iArr = this.e2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        float f7 = iArr[0];
        Point point = AndroidUtilities.displaySize;
        float f10 = round2 - (point.y / 2.0f);
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f10;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) i0.a.f(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final boolean l(MotionEvent motionEvent) {
        if (this.S0 != null) {
            s0(null, true);
        }
        float x10 = motionEvent.getX();
        b0 b0Var = this.W0;
        float translationX = ((x10 - b0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / b0Var.getScaleX();
        float y3 = ((((motionEvent.getY() - b0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / b0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-b0Var.getRotation());
        double d10 = y3;
        float measuredWidth = (b0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (b0Var.getMeasuredHeight() / 2.0f) + ((float) i0.a.f(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        b0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int l0(boolean z10) {
        return this.j2;
    }

    public final void m0(boolean z10) {
        int i10 = 0;
        if (this.g2) {
            y0(0);
        }
        if (z10) {
            tz tzVar = this.f2;
            if (tzVar == null || tzVar.getVisibility() != 0) {
                n0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f2.getMeasuredHeight());
            ofFloat.addUpdateListener(new o(this, i10));
            this.i2 = true;
            ofFloat.addListener(new z(this, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.w);
            ofFloat.start();
        }
    }

    public final void n0() {
        tz tzVar;
        b4 b4Var;
        if (this.j2 > 0 && (b4Var = ((it0) this).o2.K1) != null) {
            b4Var.a();
        }
        if (!this.g2 && (tzVar = this.f2) != null && tzVar.getVisibility() != 8) {
            this.f2.setVisibility(8);
        }
        this.j2 = 0;
    }

    @Override // rg.q1
    public final void o(qg.m mVar) {
        boolean z10 = mVar instanceof qg.b;
        w1 w1Var = this.l1;
        if (z10 || (mVar instanceof qg.d)) {
            w1Var.b(0.4f, 1.75f);
        } else {
            w1Var.b(0.05f, 1.0f);
        }
        w1Var.setDrawCenter(!(mVar instanceof qg.l));
        b0 b0Var = this.W0;
        if (b0Var.getCurrentBrush() instanceof qg.l) {
            this.k1 = true;
        }
        b0Var.setBrush(mVar);
        qg.s1 s1Var = this.K1;
        int i10 = s1Var.a;
        s1Var.a = qg.u0.e(this.P1).c();
        s1Var.c = this.m1.get();
        t0(s1Var, Integer.valueOf(i10));
        this.X0.invalidate();
    }

    public final void o0(boolean z10) {
        if (this.g1 == 0) {
            this.l1.setLayerType(z10 ? 2 : 0, null);
            this.c1.setLayerType(z10 ? 2 : 0, null);
            this.b1.setLayerType(z10 ? 2 : 0, null);
        }
    }

    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.kw0, org.telegram.ui.Components.jw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (this.f2 != null) {
            int measuredHeight = AndroidUtilities.isTablet() ? i15 - this.f2.getMeasuredHeight() : (R() + i15) - this.f2.getMeasuredHeight();
            tz tzVar = this.f2;
            tzVar.layout(0, measuredHeight, tzVar.getMeasuredWidth(), this.f2.getMeasuredHeight() + measuredHeight);
        }
        int i16 = this.V0 ? 0 : AndroidUtilities.statusBarHeight;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16;
        b0 b0Var = this.W0;
        int ceil = (int) Math.ceil((i14 - b0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.q.C(8.0f, (((i15 - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - b0Var.getMeasuredHeight()) / 2, i16);
        b0Var.layout(ceil, additionalTop, b0Var.getMeasuredWidth() + ceil, b0Var.getMeasuredHeight() + additionalTop);
        d0 d0Var = this.X0;
        d0Var.layout(ceil, additionalTop, d0Var.getMeasuredWidth() + ceil, d0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = b0Var.getMeasuredWidth();
        f0 f0Var = this.Z0;
        int measuredWidth2 = ((measuredWidth - f0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight2 = ((b0Var.getMeasuredHeight() - f0Var.getMeasuredHeight()) / 2) + additionalTop;
        f0Var.layout(measuredWidth2, measuredHeight2, f0Var.getMeasuredWidth() + measuredWidth2, f0Var.getMeasuredHeight() + measuredHeight2);
        t11 t11Var = this.a1;
        if (t11Var != null) {
            t11Var.layout(measuredWidth2, measuredHeight2, f0Var.getMeasuredWidth() + measuredWidth2, f0Var.getMeasuredHeight() + measuredHeight2);
        }
        g0 g0Var = this.Y0;
        g0Var.layout(ceil, additionalTop, g0Var.getMeasuredWidth() + ceil, g0Var.getMeasuredHeight() + additionalTop);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        this.P0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.D0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f7 = size;
        }
        float f10 = size;
        float floor = (float) Math.floor((f10 * currentActionBarHeight) / f7);
        float f11 = currentActionBarHeight2;
        if (floor > f11) {
            f10 = (float) Math.floor((f7 * f11) / currentActionBarHeight);
            floor = f11;
        }
        int i12 = (int) f10;
        int i13 = (int) floor;
        this.W0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        this.X0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        float f12 = f10 / this.R0.a;
        this.Q0 = f12;
        f0 f0Var = this.Z0;
        f0Var.setScaleX(f12);
        f0Var.setScaleY(this.Q0);
        f0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.R0.b, TLObject.FLAG_30));
        t11 t11Var = this.a1;
        if (t11Var != null) {
            t11Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.R0.b, TLObject.FLAG_30));
            this.a1.setScaleX(this.Q0);
            this.a1.setScaleY(this.Q0);
        }
        D0();
        this.Y0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        measureChild(this.c1, i10, i11);
        measureChild(this.l1, i10, i11);
        measureChild(this.e1, i10, i11);
        measureChild(this.d1, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.j2), TLObject.FLAG_30));
        FrameLayout frameLayout = this.b1;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.P0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.g2 && !this.i2) {
            this.P0 = true;
            n0();
            this.P0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            n0();
        }
        tz tzVar = this.f2;
        if (tzVar != null) {
            measureChild(tzVar, i10, i11);
        }
    }

    public final boolean p0() {
        if (this.L1) {
            x0(false);
            return true;
        }
        if (this.g2) {
            m0(true);
            return true;
        }
        if (!this.T0) {
            return false;
        }
        s0(null, true);
        return true;
    }

    @Override // rg.h
    public final /* synthetic */ boolean q() {
        return true;
    }

    public final void q0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.F0.b(jVar.getUUID(), new s(this, jVar, 0));
    }

    @Override // rg.h
    public final boolean r() {
        return !this.T0;
    }

    public final void r0(j jVar) {
        j jVar2 = this.S0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.S0 = null;
            if (jVar instanceof v2) {
                ValueAnimator valueAnimator = this.j1;
                if (valueAnimator != null && this.h1 != 0) {
                    valueAnimator.cancel();
                }
                C0(0);
            }
        }
        this.Z0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            qg.v1 v1Var = this.F0;
            v1Var.b.remove(uuid);
            v1Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(v1Var, 7));
        }
        w1 w1Var = this.l1;
        ki.t1 t1Var = this.m1;
        w1Var.setValueOverride(t1Var);
        w1Var.setShowPreview(true);
        float f7 = t1Var.get();
        qg.s1 s1Var = this.K1;
        s1Var.c = f7;
        t0(s1Var, null);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.P0) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s0(j jVar, boolean z10) {
        m0 m0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof v2;
        int i11 = 2;
        if (z12 && (((i10 = this.h1) == -1 && this.g1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.j1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.L1) {
                x0(false);
            }
            C0(2);
        }
        if (z12 && z10) {
            v2 v2Var = (v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            o1 o1Var = this.u1;
            o1Var.setAlignment(i11);
            o1Var.setTypeface(v2Var.getTypeface().a);
            o1Var.e(v2Var.getType(), true);
            this.d1.invalidate();
        }
        j jVar2 = this.S0;
        if (jVar2 == null) {
            m0Var = this;
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!this.T0) {
                    int[] k02 = k0(jVar2);
                    z0(new s(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof v2) {
                    AndroidUtilities.showKeyboard(((v2) jVar2).getFocusedView());
                    m0(false);
                }
                return true;
            }
            m0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = m0Var.S0;
            if (jVar3 instanceof v2) {
                v2 v2Var2 = (v2) jVar3;
                u2 u2Var = v2Var2.q0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    m0Var.T0 = false;
                    AndroidUtilities.hideKeyboard(((v2) m0Var.S0).getFocusedView());
                    m0(false);
                }
            }
            z11 = true;
        }
        j jVar4 = m0Var.S0;
        m0Var.S0 = jVar;
        if ((jVar4 instanceof v2) && TextUtils.isEmpty(((v2) jVar4).getText())) {
            r0(jVar4);
        }
        j jVar5 = m0Var.S0;
        ki.t1 t1Var = m0Var.m1;
        qg.s1 s1Var = m0Var.K1;
        w1 w1Var = m0Var.l1;
        if (jVar5 == null) {
            ValueAnimator valueAnimator2 = m0Var.j1;
            if (valueAnimator2 != null && m0Var.h1 != 0) {
                valueAnimator2.cancel();
            }
            if (m0Var.L1) {
                x0(false);
            }
            C0(0);
            w1Var.setValueOverride(t1Var);
            w1Var.setShowPreview(true);
            s1Var.c = t1Var.get();
            t0(s1Var, null);
            return z11;
        }
        g0 g0Var = m0Var.Y0;
        jVar5.m0 = g0Var;
        jVar5.l(g0Var, true);
        m0Var.Z0.bringChildToFront(m0Var.S0);
        j jVar6 = m0Var.S0;
        if (!(jVar6 instanceof v2)) {
            w1Var.setValueOverride(t1Var);
            w1Var.setShowPreview(true);
            s1Var.c = t1Var.get();
            t0(s1Var, null);
            return true;
        }
        v2 v2Var3 = (v2) jVar6;
        v2Var3.z0 = false;
        v2Var3.getSwatch().c = s1Var.c;
        t0(v2Var3.getSwatch(), null);
        w1Var.setValueOverride(new j5(v2Var3, (int) (m0Var.R0.a / 9.0f), 1));
        w1Var.setShowPreview(false);
        return true;
    }

    public void setBlurredBackgroundDrawableForTools(dh.d dVar) {
        dVar.p(AndroidUtilities.dp(4.0f));
        this.c2 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.W1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f7) {
        if (this.g1 == 0) {
            this.l1.setTranslationX(f7);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.U1 = runnable;
    }

    @Override // rg.m1
    public final void t() {
        b4 b4Var;
        if (!this.h2 && !this.g2) {
            j0(true);
            return;
        }
        boolean z10 = this.g2;
        if (z10 && (b4Var = ((it0) this).o2.K1) != null) {
            b4Var.e = true;
        }
        y0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.S0;
            if (jVar instanceof v2) {
                AndroidUtilities.showKeyboard(((v2) jVar).getEditText());
            }
        }
    }

    public final void t0(qg.s1 s1Var, Integer num) {
        qg.s1 s1Var2 = this.K1;
        if (s1Var2 != s1Var) {
            s1Var2.a = s1Var.a;
            s1Var2.b = s1Var.b;
            s1Var2.c = s1Var.c;
            int i10 = this.P1;
            qg.u0.e(i10).h(s1Var.a, true);
            qg.u0.e(i10).j(s1Var.c);
        }
        int i11 = s1Var.a;
        b0 b0Var = this.W0;
        b0Var.setColor(i11);
        b0Var.setBrushSize(s1Var.c);
        int i12 = s1Var2.a;
        if (num == null || num.intValue() == i12) {
            j0 j0Var = this.c1;
            if (j0Var != null) {
                j0Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new o4(this, num, i12, 2));
            duration.start();
        }
        j jVar = this.S0;
        if (jVar instanceof v2) {
            ((v2) jVar).setSwatch(new qg.s1(s1Var.b, s1Var.c, s1Var.a));
        }
    }

    @Override // rg.h
    public final void u(float f7, float f10, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) i0.a.f(radians, d10, Math.sin(radians) * d));
    }

    public final void u0(float f7) {
        this.C0 = f7;
        this.b1.setTranslationY(-f7);
        this.c1.setTranslationY(f7);
    }

    @Override // rg.h
    public final boolean v(j jVar) {
        return s0(jVar, true);
    }

    @Override // rg.h
    public final int[] w(j jVar) {
        return k0(jVar);
    }

    public final void w0(float f7, float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        this.I0 = f7;
        this.N0 = f12;
        this.O0 = f13;
        this.J0 = f10;
        this.K0 = f11;
        this.L0 = f10;
        float f19 = f11 + 0.0f;
        this.M0 = f19;
        int i10 = 0;
        while (i10 < 4) {
            View view = i10 == 0 ? this.Z0 : i10 == 1 ? this.Y0 : i10 == 2 ? this.W0 : this.X0;
            MediaController.CropState cropState = this.H0;
            if (cropState != null) {
                float f20 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth == 0 || measuredHeight == 0) {
                    return;
                }
                int i11 = cropState.transformRotation;
                if (i11 == 90 || i11 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f12 / ((int) (cropState.cropPw * r12)), f13 / ((int) (cropState.cropPh * r13)));
                f15 = f20 * max;
                float C = com.google.android.gms.internal.cast.a6.C(cropState.cropPx, measuredWidth, f7, max);
                float f21 = cropState.cropScale;
                f16 = (C * f21) + f10;
                f14 = 1.0f;
                f17 = (cropState.cropPy * measuredHeight * f7 * max * f21) + f19;
                f18 = cropState.cropRotate + i11;
            } else {
                f14 = 1.0f;
                f15 = i10 == 0 ? this.Q0 * 1.0f : 1.0f;
                f16 = f10;
                f17 = f19;
                f18 = 0.0f;
            }
            float f22 = ((-this.j2) / 2.0f) + f17;
            float f23 = f7 * f15;
            if (Float.isNaN(f23)) {
                f23 = f14;
            }
            view.setScaleX(f23);
            view.setScaleY(f23);
            view.setTranslationX(f16);
            view.setTranslationY(f22);
            view.setRotation(f18);
            view.invalidate();
            i10++;
        }
        D0();
        invalidate();
    }

    @Override // rg.q1
    public final qg.u0 x() {
        return qg.u0.e(this.P1);
    }

    public final void x0(final boolean z10) {
        if (this.L1 != z10) {
            this.L1 = z10;
            o1.k kVar = this.M1;
            if (kVar != null) {
                kVar.c();
            }
            o1.k kVar2 = new o1.k(new o1.j(z10 ? 0.0f : 1000.0f));
            this.M1 = kVar2;
            o1.l lVar = new o1.l();
            lVar.i = z10 ? 1000.0f : 0.0f;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.u = lVar;
            int i10 = 1;
            final boolean[] zArr = {this.h2 || this.g2};
            final float translationY = this.c1.getTranslationY();
            final ViewGroup barView = getBarView();
            this.M1.b(new o1.g() { // from class: rg.t
                @Override // o1.g
                public final void a(o1.h hVar, float f7, float f10) {
                    m0 m0Var = m0.this;
                    j0 j0Var = m0Var.c1;
                    float f11 = f7 / 1000.0f;
                    m0Var.N1 = f11;
                    float f12 = ((1.0f - f11) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f12);
                    view.setScaleY(f12);
                    view.setTranslationY((Math.min(m0Var.N1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(m0Var.N1, 0.25f) / 0.25f));
                    i0 i0Var = m0Var.G1;
                    float f13 = m0Var.N1;
                    boolean z11 = z10;
                    i0Var.z1(f13, z11);
                    m0Var.B0.setProgress(m0Var.N1);
                    m0Var.A0.setProgress(m0Var.N1);
                    m0Var.f1.setTranslationY(AndroidUtilities.dp(32.0f) * m0Var.N1);
                    if (zArr[0]) {
                        float f14 = m0Var.N1;
                        if (!z11) {
                            f14 = 1.0f - f14;
                        }
                        j0Var.setTranslationY(translationY - ((AndroidUtilities.dp(40.0f) * f14) * (z11 ? 1 : -1)));
                    }
                    j0Var.invalidate();
                    if (view == m0Var.u1) {
                        m0Var.d1.invalidate();
                    }
                }
            });
            this.M1.a(new r(this, z10, i10));
            this.M1.h();
            if (z10) {
                i0 i0Var = this.G1;
                i0Var.setVisibility(0);
                i0Var.setSelectedColorIndex(qg.u0.e(this.P1).d());
            }
        }
    }

    public final void y0(int i10) {
        o1 o1Var = this.u1;
        int i11 = 0;
        int i12 = 1;
        if (i10 != 1) {
            ah emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.e, true);
            }
            tz tzVar = this.f2;
            if (tzVar != null) {
                this.g2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    tzVar.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.j2 = 0;
            }
            b4 b4Var = ((it0) this).o2.K1;
            if (b4Var != null) {
                b4Var.a();
            }
            requestLayout();
            getHeight();
            return;
        }
        tz tzVar2 = this.f2;
        boolean z10 = tzVar2 != null && tzVar2.getVisibility() == 0;
        tz tzVar3 = this.f2;
        if (tzVar3 != null && tzVar3.c1 != UserConfig.selectedAccount) {
            removeView(tzVar3);
            this.f2 = null;
        }
        if (this.f2 == null) {
            tz tzVar4 = new tz(null, true, false, false, getContext(), false, null, null, true, this.Q1, false, false);
            this.f2 = tzVar4;
            tzVar4.U0 = true;
            tzVar4.setVisibility(8);
            if (AndroidUtilities.isTablet()) {
                this.f2.setForseMultiwindowLayout(true);
            }
            this.f2.setDelegate(new a0(this));
            addView(this.f2);
        }
        this.f2.setVisibility(0);
        this.g2 = true;
        tz tzVar5 = this.f2;
        if (this.k2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.k2 = AndroidUtilities.dp(150.0f);
            } else {
                this.k2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            }
        }
        if (this.l2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.l2 = AndroidUtilities.dp(150.0f);
            } else {
                this.l2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
            }
        }
        Point point = AndroidUtilities.displaySize;
        int i13 = point.x > point.y ? this.l2 : this.k2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tzVar5.getLayoutParams();
        layoutParams.height = i13;
        tzVar5.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            j jVar = this.S0;
            if (jVar instanceof v2) {
                AndroidUtilities.hideKeyboard(((v2) jVar).getEditText());
            }
        }
        this.j2 = i13;
        requestLayout();
        b4 b4Var2 = ((it0) this).o2.K1;
        if (b4Var2 != null) {
            b4Var2.a();
        }
        ah emojiButton2 = o1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(yg.d, true);
        }
        getHeight();
        if (z10 || this.h2) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j2, 0.0f);
        ofFloat.addUpdateListener(new o(this, i12));
        ofFloat.addListener(new z(this, i11));
        ofFloat.start();
    }

    public final void z0(Runnable runnable, m0 m0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.m1 m1Var = this.R1;
        if (m1Var != null && m1Var.isShowing()) {
            this.R1.d(true);
            return;
        }
        if (this.S1 == null) {
            this.T1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.Q1);
            this.S1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.S1.setBackgroundColor(-14145495);
            this.S1.setOnTouchListener(new x4(this, 1));
            this.S1.setDispatchKeyEventListener(new q(this));
            this.S1.setShownFromBottom(true);
        }
        this.S1.d();
        runnable.run();
        if (this.R1 == null) {
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(this.S1, -2, -2);
            this.R1 = m1Var2;
            m1Var2.b = true;
            m1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.R1.setOutsideTouchable(true);
            this.R1.setClippingEnabled(true);
            this.R1.setInputMethodMode(2);
            this.R1.setSoftInputMode(0);
            this.R1.getContentView().setFocusableInTouchMode(true);
            this.R1.setOnDismissListener(new z4(this, 1));
        }
        this.S1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.R1.setFocusable(true);
        this.R1.showAtLocation(m0Var, i10, i11 - (this.S1.getMeasuredWidth() / 2), i12 - this.S1.getMeasuredHeight());
        org.telegram.ui.ActionBar.m1.i(this.S1);
    }

    @Override // rg.h
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // rg.h
    public final /* synthetic */ void C() {
    }

    @Override // rg.h
    public final /* synthetic */ void f(boolean z10) {
    }

    @Override // rg.h
    public final /* synthetic */ void g(boolean z10) {
    }

    public View getView() {
        return this;
    }

    @Override // rg.h
    public final /* synthetic */ void j() {
    }

    @Override // rg.h
    public final /* synthetic */ void k() {
    }

    @Override // rg.h
    public final /* synthetic */ void m(boolean z10) {
    }

    @Override // rg.h
    public final /* synthetic */ void y() {
    }
}
