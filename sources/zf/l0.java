package zf;

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
import h7.z5;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import jh.g3;
import jh.t7;
import lh.a4;
import lh.e6;
import lh.j5;
import lh.m5;
import lh.n4;
import lh.n5;
import lh.t4;
import lh.w4;
import lh.y4;
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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.hq0;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class l0 extends av0 implements q1, h, m1, yu0, NotificationCenter.NotificationCenterDelegate {
    public final Bitmap A0;
    public boolean A1;
    public final yf.s1 B0;
    public o1.j B1;
    public final DispatchQueue C0;
    public final i0 C1;
    public final MediaController.CropState D0;
    public final Paint D1;
    public float E0;
    public final Paint E1;
    public float F0;
    public final Paint F1;
    public float G0;
    public final yf.p1 G1;
    public float H0;
    public boolean H1;
    public float I0;
    public o1.j I1;
    public float J0;
    public float J1;
    public float K0;
    public final Paint K1;
    public boolean L0;
    public final int L1;
    public float M0;
    public final ng.b M1;
    public tu0 N0;
    public org.telegram.ui.ActionBar.n1 N1;
    public j O0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O1;
    public boolean P0;
    public Rect P1;
    public int Q0;
    public Runnable Q1;
    public final boolean R0;
    public final yf.r0 R1;
    public final b0 S0;
    public boolean S1;
    public final d0 T0;
    public float T1;
    public final g0 U0;
    public boolean U1;
    public final f0 V0;
    public final y5 V1;
    public f01 W0;
    public final Paint W1;
    public final FrameLayout X0;
    public final Paint X1;
    public final j0 Y0;
    public lg.d Y1;
    public final h0 Z0;
    public final float[] Z1;
    public final FrameLayout a1;
    public final int[] a2;
    public m5 b1;
    public yy b2;
    public int c1;
    public boolean c2;
    public int d1;
    public boolean d2;
    public float e1;
    public boolean e2;
    public ValueAnimator f1;
    public int f2;
    public boolean g1;
    public int g2;
    public final w1 h1;
    public int h2;
    public final n2.b0 i1;
    public int i2;
    public ArrayList j1;
    public boolean j2;
    public final int k1;
    public BigInteger l1;
    public TextView m1;
    public TextView n1;
    public TextView o1;
    public final r1 p1;
    public final o1 q1;
    public final t1 r1;
    public final ImageView s1;
    public final LinearLayout t1;
    public final TextView u1;
    public final TextView v1;
    public final f1 w0;
    public final TextView w1;
    public final j1 x0;
    public final Paint x1;
    public float y0;
    public final Paint y1;
    public final Bitmap z0;
    public float z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [zf.v2] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.view.View, zf.o2, zf.y] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r27v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Components.yu0, org.telegram.ui.Components.zu0, zf.l0, zf.m1, zf.q1] */
    public l0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, hq0 hq0Var, c6 c6Var) {
        super(context, activity);
        Emoji.EmojiSpan[] emojiSpanArr;
        x1 x1Var;
        ArrayList arrayList2 = arrayList;
        boolean z10 = false;
        this.c1 = 0;
        this.d1 = -1;
        final ys0 ys0Var = (ys0) this;
        this.i1 = new n2.b0(ys0Var, 26);
        byte b10 = 1;
        this.x1 = new Paint(1);
        this.y1 = new Paint(1);
        this.D1 = new Paint(1);
        this.E1 = new Paint(1);
        this.F1 = new Paint(1);
        yf.p1 p1Var = new yf.p1(1.0f, 0.016773745f, -1);
        this.G1 = p1Var;
        this.K1 = new Paint(1);
        this.U1 = false;
        this.V1 = new y5((View) this, 350L, er.h);
        this.W1 = new Paint(1);
        Paint paint = new Paint(1);
        this.X1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.Z1 = new float[2];
        this.a2 = new int[2];
        new mu0(ys0Var, 10);
        setDelegate(this);
        this.L1 = i10;
        this.M1 = new ng.b(3, c6Var);
        this.D0 = cropState;
        this.R0 = context instanceof BubbleActivity;
        yf.r0 e9 = yf.r0.e(i10);
        this.R1 = e9;
        e9.i(0, true);
        p1Var.a = e9.c();
        p1Var.c = e9.i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.C0 = dispatchQueue;
        this.z0 = bitmap;
        this.A0 = bitmap2;
        this.k1 = i11;
        yf.s1 s1Var = new yf.s1();
        this.B0 = s1Var;
        s1Var.a = new t0.c(ys0Var, 8);
        b0 b0Var = new b0(ys0Var, context, new yf.p0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.S0 = b0Var;
        b0Var.setDelegate(new c0(ys0Var, hq0Var));
        b0Var.setUndoStore(s1Var);
        b0Var.setQueue(dispatchQueue);
        b0Var.setVisibility(4);
        addView(b0Var, z5.e(-1, -1, 51));
        d0 d0Var = new d0(ys0Var, context);
        this.T0 = d0Var;
        d0Var.setVisibility(4);
        addView(d0Var, z5.e(-1, -1, 51));
        f0 f0Var = new f0(ys0Var, context, new e0(ys0Var));
        this.V0 = f0Var;
        addView(f0Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList2.get(i12);
                byte b11 = mediaEntity.type;
                if (b11 == 0) {
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z10);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    x1Var = i02;
                } else if (b11 == b10) {
                    ?? j02 = j0(z10);
                    j02.setType(mediaEntity.subType);
                    j02.setTypeface(mediaEntity.textTypeface);
                    j02.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                    int size2 = arrayList3.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList3.get(i13);
                        t5 t5Var = new t5(emojiEntity.document_id, j02.getFontMetricsInt());
                        int i14 = emojiEntity.offset;
                        spannableString.setSpan(t5Var, i14, emojiEntity.length + i14, 33);
                        size2 = size2;
                    }
                    CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                    if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    j02.setText(replaceEmoji);
                    u0(j02, mediaEntity.textAlign);
                    yf.p1 swatch = j02.getSwatch();
                    swatch.a = mediaEntity.color;
                    j02.setSwatch(swatch);
                    x1Var = j02;
                } else if (b11 == 2) {
                    x1 h02 = h0(mediaEntity.text, false);
                    h02.x0 = false;
                    if ((mediaEntity.subType & 2) != 0) {
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
                    i12++;
                    arrayList2 = arrayList;
                    z10 = false;
                    b10 = 1;
                }
                x1Var.setX((mediaEntity.x * this.N0.a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                x1Var.setY((mediaEntity.y * this.N0.b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                x1Var.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + x1Var.getX(), (mediaEntity.viewHeight / 2.0f) + x1Var.getY()));
                x1Var.setScale(mediaEntity.scale);
                x1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i12++;
                arrayList2 = arrayList;
                z10 = false;
                b10 = 1;
            }
        }
        this.V0.setVisibility(4);
        g0 g0Var = new g0(context);
        this.U0 = g0Var;
        addView(g0Var);
        ?? frameLayout = new FrameLayout(context);
        this.X0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, z5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.s1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(g6.f0(1090519039, 1, -1));
        final int i15 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: zf.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        ys0 ys0Var2 = ys0Var;
                        b0 b0Var2 = ys0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof yf.l)) {
                            b0Var2.b();
                            ys0Var2.p1.setSelectedIndex(1);
                            ys0Var2.l((yf.m) yf.m.a.get(0));
                            break;
                        } else {
                            ys0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        ys0 ys0Var3 = ys0Var;
                        b0 b0Var3 = ys0Var3.S0;
                        yf.s1 s1Var2 = ys0Var3.B0;
                        if (s1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof yf.l)) {
                                b0Var3.b();
                                ys0Var3.p1.setSelectedIndex(1);
                                ys0Var3.l((yf.m) yf.m.a.get(0));
                            }
                            b0Var3.a();
                            s1Var2.c.clear();
                            s1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            ys0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ys0 ys0Var4 = ys0Var;
                        j jVar = ys0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (ys0Var4.c2) {
                            ys0Var4.l0(false);
                        }
                        ys0Var4.q0(ys0Var4.O0);
                        ys0Var4.r0(null, true);
                        break;
                    default:
                        ys0Var.r0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, z5.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.t1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(g6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        rl.h(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, z5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, z5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ag.l2(28));
        frameLayout.addView(linearLayout, z5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.u1 = textView2;
        textView2.setBackground(g6.f0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i16 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: zf.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        ys0 ys0Var2 = ys0Var;
                        b0 b0Var2 = ys0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof yf.l)) {
                            b0Var2.b();
                            ys0Var2.p1.setSelectedIndex(1);
                            ys0Var2.l((yf.m) yf.m.a.get(0));
                            break;
                        } else {
                            ys0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        ys0 ys0Var3 = ys0Var;
                        b0 b0Var3 = ys0Var3.S0;
                        yf.s1 s1Var2 = ys0Var3.B0;
                        if (s1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof yf.l)) {
                                b0Var3.b();
                                ys0Var3.p1.setSelectedIndex(1);
                                ys0Var3.l((yf.m) yf.m.a.get(0));
                            }
                            b0Var3.a();
                            s1Var2.c.clear();
                            s1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            ys0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ys0 ys0Var4 = ys0Var;
                        j jVar = ys0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (ys0Var4.c2) {
                            ys0Var4.l0(false);
                        }
                        ys0Var4.q0(ys0Var4.O0);
                        ys0Var4.r0(null, true);
                        break;
                    default:
                        ys0Var.r0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView h = pa.h(frameLayout, textView2, z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.v1 = h;
        h.setBackground(g6.f0(822083583, 7, -1));
        h.setPadding(pa.c(8.0f, R.string.Clear, h), 0, AndroidUtilities.dp(8.0f), 0);
        h.setGravity(16);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 16.0f);
        final int i17 = 2;
        h.setOnClickListener(new View.OnClickListener() { // from class: zf.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        ys0 ys0Var2 = ys0Var;
                        b0 b0Var2 = ys0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof yf.l)) {
                            b0Var2.b();
                            ys0Var2.p1.setSelectedIndex(1);
                            ys0Var2.l((yf.m) yf.m.a.get(0));
                            break;
                        } else {
                            ys0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        ys0 ys0Var3 = ys0Var;
                        b0 b0Var3 = ys0Var3.S0;
                        yf.s1 s1Var2 = ys0Var3.B0;
                        if (s1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof yf.l)) {
                                b0Var3.b();
                                ys0Var3.p1.setSelectedIndex(1);
                                ys0Var3.l((yf.m) yf.m.a.get(0));
                            }
                            b0Var3.a();
                            s1Var2.c.clear();
                            s1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            ys0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ys0 ys0Var4 = ys0Var;
                        j jVar = ys0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (ys0Var4.c2) {
                            ys0Var4.l0(false);
                        }
                        ys0Var4.q0(ys0Var4.O0);
                        ys0Var4.r0(null, true);
                        break;
                    default:
                        ys0Var.r0(null, true);
                        break;
                }
            }
        });
        h.setAlpha(0.0f);
        h.setVisibility(8);
        TextView h10 = pa.h(frameLayout, h, z5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.w1 = h10;
        h10.setBackground(g6.f0(822083583, 7, -1));
        h10.setPadding(pa.c(8.0f, R.string.Done, h10), 0, AndroidUtilities.dp(8.0f), 0);
        h10.setGravity(16);
        h10.setTextColor(-1);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setTextSize(1, 16.0f);
        final int i18 = 3;
        h10.setOnClickListener(new View.OnClickListener() { // from class: zf.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        ys0 ys0Var2 = ys0Var;
                        b0 b0Var2 = ys0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof yf.l)) {
                            b0Var2.b();
                            ys0Var2.p1.setSelectedIndex(1);
                            ys0Var2.l((yf.m) yf.m.a.get(0));
                            break;
                        } else {
                            ys0Var2.B0.c();
                            break;
                        }
                        break;
                    case 1:
                        ys0 ys0Var3 = ys0Var;
                        b0 b0Var3 = ys0Var3.S0;
                        yf.s1 s1Var2 = ys0Var3.B0;
                        if (s1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof yf.l)) {
                                b0Var3.b();
                                ys0Var3.p1.setSelectedIndex(1);
                                ys0Var3.l((yf.m) yf.m.a.get(0));
                            }
                            b0Var3.a();
                            s1Var2.c.clear();
                            s1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            ys0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ys0 ys0Var4 = ys0Var;
                        j jVar = ys0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (ys0Var4.c2) {
                            ys0Var4.l0(false);
                        }
                        ys0Var4.q0(ys0Var4.O0);
                        ys0Var4.r0(null, true);
                        break;
                    default:
                        ys0Var.r0(null, true);
                        break;
                }
            }
        });
        h10.setAlpha(0.0f);
        h10.setVisibility(8);
        frameLayout.addView(h10, z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        j0 j0Var = new j0(ys0Var, context);
        this.Y0 = j0Var;
        j0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        j0Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(j0Var, z5.e(-1, 104, 80));
        r1 r1Var = new r1(context, bitmap2 != null);
        this.p1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        j0Var.addView(r1Var, z5.c(48.0f, -1));
        o1 o1Var = new o1(context);
        this.q1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        o1Var.setAlignment(yf.r0.e(i10).g);
        j0Var.addView(o1Var, z5.c(48.0f, -1));
        h0 h0Var = new h0(ys0Var, context);
        this.Z0 = h0Var;
        addView(h0Var, z5.c(-1.0f, -1));
        t1 t1Var = new t1(context);
        this.r1 = t1Var;
        t1Var.setVisibility(8);
        t1Var.setOnItemClickListener(new ag.p0(ys0Var, 23));
        o1Var.setTypefaceListView(t1Var);
        h0Var.addView(t1Var, z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.x1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.x1.setColor(1728053247);
        this.x1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.y1.setColor(g6.v0(g6.G8, this.M1));
        i0 i0Var = new i0(ys0Var, context);
        this.C1 = i0Var;
        i0Var.setVisibility(8);
        i0Var.setColorPalette(yf.r0.e(i10));
        i0Var.setColorListener(new m(ys0Var, 0));
        j0Var.addView(i0Var, z5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        f1 f1Var = new f1(context);
        this.w0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(g6.f0(1090519039, 1, -1));
        j0Var.addView(f1Var, z5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        j1 j1Var = new j1(context);
        this.x0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(g6.f0(1090519039, 1, -1));
        j1Var.setOnClickListener(new ld0(ys0Var, context, bitmap2, 8));
        j0Var.addView(j1Var, z5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        w1 w1Var = new w1(context);
        this.h1 = w1Var;
        w1Var.setColorSwatch(this.G1);
        w1Var.setRenderView(this.S0);
        w1Var.setValueOverride(this.i1);
        this.G1.c = this.i1.get();
        w1Var.setOnUpdate(new we.a(ys0Var, i10, 3));
        addView(w1Var, z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a1 = frameLayout2;
        addView(frameLayout2, z5.c(-1.0f, -1));
        this.F1.setStyle(style);
        this.F1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.G1, null);
        l((yf.m) yf.m.a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static /* synthetic */ void Z(ys0 ys0Var, Integer num) {
        ys0Var.setNewColor(num.intValue());
        ys0Var.w0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: all -> 0x002c, Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:4:0x0003, B:6:0x0022, B:8:0x0026, B:12:0x0036, B:14:0x005a, B:17:0x0061, B:18:0x0068, B:21:0x006d, B:22:0x0077, B:24:0x007d, B:26:0x0091, B:30:0x009b, B:34:0x00a7, B:36:0x00aa, B:41:0x00ad, B:46:0x00b4), top: B:3:0x0003, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(l0 l0Var) {
        yf.s0 s0Var;
        boolean z10;
        Bitmap bitmap = l0Var.A0;
        e8.c cVar = null;
        try {
            try {
                e8.b bVar = new e8.b(l0Var.getContext());
                bVar.c(1);
                bVar.b(1);
                bVar.c = false;
                cVar = bVar.a();
                if (!cVar.c.k()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    cVar.N();
                    return;
                }
                a5.n nVar = new a5.n(5);
                b8.b bVar2 = (b8.b) nVar.b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                nVar.d = bitmap;
                bVar2.a = width;
                bVar2.b = height;
                bVar2.c = l0Var.getFrameRotation();
                if (((ByteBuffer) nVar.c) == null && ((Bitmap) nVar.d) == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                try {
                    SparseArray Q = cVar.Q(nVar);
                    ArrayList arrayList = new ArrayList();
                    tu0 paintingSize = l0Var.getPaintingSize();
                    for (int i10 = 0; i10 < Q.size(); i10++) {
                        e8.a aVar = (e8.a) Q.get(Q.keyAt(i10));
                        int i11 = l0Var.k1;
                        if (i11 % 360 != 90 && i11 % 360 != 270) {
                            z10 = false;
                            s0Var = new yf.s0(aVar, bitmap, paintingSize, z10);
                            if (!(s0Var.d == null)) {
                                arrayList.add(s0Var);
                            }
                        }
                        z10 = true;
                        s0Var = new yf.s0(aVar, bitmap, paintingSize, z10);
                        if (!(s0Var.d == null)) {
                        }
                    }
                    l0Var.j1 = arrayList;
                    cVar.N();
                } catch (Throwable th) {
                    FileLog.e(th);
                    cVar.N();
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                if (0 == 0) {
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cVar.N();
            }
            throw th2;
        }
    }

    public static void b0(l0 l0Var) {
        j jVar;
        f0 f0Var = l0Var.V0;
        j jVar2 = l0Var.O0;
        if (jVar2 != null) {
            PointF A0 = l0Var.A0(jVar2);
            j jVar3 = l0Var.O0;
            if (jVar3 instanceof o2) {
                o2 o2Var = new o2(l0Var.getContext(), (o2) l0Var.O0, A0);
                o2Var.setDelegate(l0Var);
                f0Var.addView(o2Var);
                jVar = o2Var;
            } else if (jVar3 instanceof v2) {
                v2 v2Var = new v2(l0Var.getContext(), (v2) l0Var.O0, A0);
                v2Var.setDelegate(l0Var);
                v2Var.setMaxWidth((int) (l0Var.getPaintingSize().a - 20.0f));
                f0Var.addView(v2Var, z5.c(-2.0f, -2));
                jVar = v2Var;
            } else {
                jVar = null;
            }
            l0Var.p0(jVar);
            l0Var.r0(jVar, true);
        }
        org.telegram.ui.ActionBar.n1 n1Var = l0Var.N1;
        if (n1Var == null || !n1Var.isShowing()) {
            return;
        }
        l0Var.N1.d(true);
    }

    public static void c0(ys0 ys0Var, Integer num) {
        yf.r0 r0Var = ys0Var.R1;
        r0Var.h(num.intValue(), true);
        r0Var.g();
        ys0Var.setNewColor(num.intValue());
        i0 i0Var = ys0Var.C1;
        i0Var.setSelectedColorIndex(r0Var.d());
        i0Var.getAdapter().l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.c1 == 2 ? this.q1 : this.p1;
    }

    private int getFrameRotation() {
        int i10 = this.k1;
        if (i10 == 90) {
            return 1;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 3;
        }
        return 2;
    }

    private tu0 getPaintingSize() {
        tu0 tu0Var = this.N0;
        if (tu0Var != null) {
            return tu0Var;
        }
        Bitmap bitmap = this.z0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        int i10 = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
        tu0 tu0Var2 = new tu0(width, height);
        float f10 = i10;
        tu0Var2.a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        tu0Var2.b = floor;
        if (floor > f10) {
            tu0Var2.b = f10;
            tu0Var2.a = (float) Math.floor((f10 * width) / height);
        }
        this.N0 = tu0Var2;
        return tu0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i10) {
        yf.p1 p1Var = this.G1;
        int i11 = p1Var.a;
        p1Var.a = i10;
        s0(p1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new t4(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.Q0 = i10;
        j jVar = this.O0;
        if (jVar instanceof v2) {
            ((v2) jVar).setType(i10);
        }
        yf.r0 e9 = yf.r0.e(this.L1);
        e9.h = i10;
        e9.a.edit().putInt("text_type", i10).apply();
        this.q1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        m5 m5Var = new m5(this, context);
        this.b1 = m5Var;
        m5Var.setClipToPadding(false);
        this.b1.setOrientation(0);
        this.Y0.addView(this.b1, z5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.m1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.m1;
        int i10 = g6.i6;
        ng.b bVar = this.M1;
        textView2.setBackground(g6.f0(g6.v0(i10, bVar), 7, -1));
        this.m1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.m1.setTextColor(-1);
        this.m1.setTextSize(1, 14.0f);
        this.m1.setGravity(1);
        this.m1.setTypeface(AndroidUtilities.bold());
        this.m1.setSingleLine();
        this.m1.setOnClickListener(new k(this, 0));
        this.b1.addView(this.m1, z5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.n1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.n1.setBackground(g6.f0(g6.v0(i10, bVar), 7, -1));
        this.n1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.n1.setOnClickListener(new k(this, 1));
        this.n1.setTextColor(-1);
        this.n1.setTextSize(1, 14.0f);
        this.n1.setGravity(1);
        this.n1.setTypeface(AndroidUtilities.bold());
        this.n1.setAlpha(0.6f);
        this.n1.setSingleLine();
        this.b1.addView(this.n1, z5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.o1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.o1.setBackground(g6.f0(g6.v0(i10, bVar), 7, -1));
        this.o1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.o1.setTextColor(-1);
        this.o1.setTextSize(1, 14.0f);
        this.o1.setGravity(1);
        this.o1.setTypeface(AndroidUtilities.bold());
        this.o1.setAlpha(0.6f);
        this.o1.setSingleLine();
        this.o1.setOnClickListener(new k(this, 4));
        this.b1.addView(this.o1, z5.l(1.0f, 0, -2));
    }

    public static void u0(v2 v2Var, int i10) {
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

    @Override // zf.q1
    public final void A() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(j jVar) {
        MediaController.CropState cropState = this.D0;
        float f10 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF g02 = g0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                f0 f0Var = this.V0;
                if (i10 >= f0Var.getChildCount()) {
                    break;
                }
                View childAt = f0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - g02.y, 2.0d) + Math.pow(position2.x - g02.x, 2.0d))) < f11) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return g02;
            }
            g02 = new PointF(g02.x + f10, g02.y + f10);
        }
    }

    public final void B0(int i10) {
        if (this.c1 == i10 || this.d1 == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.f1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = this.c1;
        ViewGroup viewGroup = this.q1;
        ViewGroup viewGroup2 = this.p1;
        ViewGroup viewGroup3 = i11 == 0 ? viewGroup2 : i11 == 2 ? viewGroup : null;
        this.d1 = i10;
        ViewGroup viewGroup4 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        int i12 = this.L1;
        yf.r0 e9 = yf.r0.e(i12);
        boolean z10 = i10 == 2;
        if (e9.l != z10) {
            e9.l = z10;
            if (z10) {
                e9.i(-1, false);
            } else {
                e9.i(e9.a.getInt("brush", 0), false);
            }
        }
        int c10 = yf.r0.e(i12).c();
        yf.p1 p1Var = this.G1;
        p1Var.a = c10;
        s0(p1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.f1 = duration;
        duration.setInterpolator(er.f);
        this.f1.addUpdateListener(new g3(this, viewGroup3, viewGroup4, 4));
        this.f1.addListener(new n5(this, viewGroup3, viewGroup4, i10, 2));
        this.f1.start();
    }

    public final void C0() {
        int i10 = 0;
        while (true) {
            f0 f0Var = this.V0;
            if (i10 >= f0Var.getChildCount()) {
                return;
            }
            View childAt = f0Var.getChildAt(i10);
            if (childAt != this.O0) {
                if (childAt instanceof j) {
                    j jVar = (j) childAt;
                    if (!jVar.h0 && jVar.f0 <= 0.0f) {
                    }
                }
                i10++;
            }
            ((j) childAt).m();
            i10++;
        }
    }

    @Override // zf.m1
    public final void D() {
        z0(true);
    }

    @Override // org.telegram.ui.Components.yu0
    public final void H(int i10, boolean z10) {
        boolean z11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.d2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.h2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.h2).commit();
            } else {
                this.g2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.g2).commit();
            }
        }
        if (this.c2) {
            int i11 = z10 ? this.h2 : this.g2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.b2.setLayoutParams(layoutParams);
                this.f2 = layoutParams.height;
                requestLayout();
                a4 a4Var = ((ys0) this).k2.G1;
                if (a4Var != null) {
                    a4Var.a();
                }
                getHeight();
            }
        }
        if (this.i2 == i10 && this.j2 == z10) {
            getHeight();
            return;
        }
        this.i2 = i10;
        this.j2 = z10;
        boolean z12 = this.d2;
        j jVar = this.O0;
        if (jVar instanceof v2) {
            this.d2 = ((v2) jVar).getEditText().isFocused() && i10 > 0;
        } else {
            this.d2 = false;
        }
        if (this.d2 && this.c2) {
            x0(0);
        }
        if (this.f2 != 0 && !(z11 = this.d2) && z11 != z12 && !this.c2) {
            this.f2 = 0;
            requestLayout();
            a4 a4Var2 = ((ys0) this).k2.G1;
            if (a4Var2 != null) {
                a4Var2.a();
            }
        }
        getHeight();
    }

    @Override // zf.q1, zf.m1
    public final void a() {
        w0(true);
    }

    @Override // zf.h
    public final void c(j jVar) {
        int[] k02 = k0(jVar);
        y0(new s(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    @Override // org.telegram.ui.Components.zu0, org.telegram.ui.ActionBar.x5
    public final void d() {
        this.K1.setColor(-15132391);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f0 f0Var;
        v2 v2Var;
        String str;
        if (i10 != NotificationCenter.customTypefacesLoaded || (f0Var = this.V0) == null) {
            return;
        }
        for (int i12 = 0; i12 < f0Var.getChildCount(); i12++) {
            View childAt = f0Var.getChildAt(i12);
            if ((childAt instanceof v2) && (str = (v2Var = (v2) childAt).w0) != null) {
                v2Var.setTypeface(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i10;
        g0 g0Var;
        f0 f0Var = this.V0;
        if (view == f0Var) {
            float e9 = this.V1.e(this.S1);
            if (e9 > 0.0f) {
                float dp = AndroidUtilities.dp(24.0f * e9);
                int l1 = g6.l1(e9, 1090519039);
                Paint paint = this.W1;
                paint.setShadowLayer(dp, 0.0f, 0.0f, l1);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(f0Var.getX(), f0Var.getY());
                canvas.scale(f0Var.getScaleX(), f0Var.getScaleY(), f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, f0Var.getWidth(), f0Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, f0Var.getWidth(), f0Var.getHeight(), this.X1);
                canvas.restore();
                if ((view != this.S0 || view == this.T0 || ((view == f0Var && f0Var.getClipChildren()) || (view == (g0Var = this.U0) && g0Var.getClipChildren()))) && (cropState = this.D0) != null) {
                    canvas.save();
                    r10 = this.R0 ? 0 : AndroidUtilities.statusBarHeight;
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
                    float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.H0;
                    float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.f2) - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r10 + this.I0;
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
        if (view != this.S0) {
        }
        canvas.save();
        if (this.R0) {
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
        float ceil2 = ((float) Math.ceil((getMeasuredWidth() - scaleX2) / 2.0f)) + this.H0;
        float additionalBottom2 = (((getAdditionalBottom() + (((getMeasuredHeight() - this.f2) - currentActionBarHeight2) - AndroidUtilities.dp(48.0f))) - scaleY2) / 2.0f) + AndroidUtilities.dp(8.0f) + r10 + this.I0;
        canvas.clipRect(Math.max(0.0f, ceil2), Math.max(0.0f, additionalBottom2), Math.min(ceil2 + scaleX2, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom2 + scaleY2));
        r10 = 1;
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        if (r10 != 0) {
        }
        return drawChild2;
    }

    @Override // zf.m1
    public final void e() {
        setTextType((this.Q0 + 1) % 4);
    }

    @Override // zf.m1
    public final void f(int i10) {
        j jVar = this.O0;
        if (jVar instanceof v2) {
            u0((v2) jVar, i10);
            yf.r0 e9 = yf.r0.e(this.L1);
            e9.g = i10;
            e9.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new rh.o2(10, this, (x1) view)).start();
    }

    public final PointF g0() {
        tu0 paintingSize = getPaintingSize();
        float f10 = paintingSize.a / 2.0f;
        float f11 = paintingSize.b / 2.0f;
        if (this.D0 != null) {
            double radians = (float) Math.toRadians(-(r2.transformRotation + r2.cropRotate));
            float cos = (float) ((Math.cos(radians) * r2.cropPx) - (Math.sin(radians) * r2.cropPy));
            float b10 = (float) i0.a.b(radians, r2.cropPy, Math.sin(radians) * r2.cropPx);
            f10 -= cos * paintingSize.a;
            f11 -= b10 * paintingSize.b;
        }
        return new PointF(f10, f11);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.w0;
    }

    @Override // org.telegram.ui.Components.av0, org.telegram.ui.Components.zu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.x0;
    }

    public long getLcm() {
        return this.l1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        t5[] t5VarArr;
        f0 f0Var = this.V0;
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
                if ((text instanceof Spanned) && (t5VarArr = (t5[]) ((Spanned) text).getSpans(0, text.length(), t5.class)) != null) {
                    for (t5 t5Var : t5VarArr) {
                        if (t5Var != null) {
                            TLRPC.Document document = t5Var.document;
                            if (document == null) {
                                document = k5.f(this.L1, t5Var.getDocumentId());
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
        return this.y0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public yf.b1 getRenderView() {
        return this.S0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.O0;
        f0 f0Var = this.V0;
        if (jVar == null) {
            return getY() + f0Var.getMeasuredHeight();
        }
        jVar.getLocationInWindow(new int[2]);
        return (f0Var.getScaleY() * this.O0.getHeight()) + r2[1];
    }

    public f01 getThanosEffect() {
        if (!f01.c()) {
            return null;
        }
        if (this.W0 == null) {
            f01 f01Var = new f01(getContext(), new n(this, 0));
            this.W0 = f01Var;
            addView(f01Var);
        }
        return this.W0;
    }

    public final x1 h0(String str, boolean z10) {
        float f10;
        tu0 tu0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e9) {
            FileLog.e(e9);
            f10 = 1.0f;
        }
        f0 f0Var = this.V0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(f0Var.getMeasuredWidth() * 0.5d);
            tu0Var = new tu0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(f0Var.getMeasuredHeight() * 0.5d);
            tu0Var = new tu0(f10 * floor2, floor2);
        }
        tu0 tu0Var2 = tu0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = tu0Var2.a;
            tu0Var2.a = tu0Var2.b;
            tu0Var2.b = f11;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        x1 x1Var = new x1(context, g02, tu0Var2, str, intValue);
        x1Var.setDelegate(this);
        f0Var.addView(x1Var);
        if (z10) {
            p0(x1Var);
            r0(x1Var, true);
        }
        return x1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y i0(Object obj, TLRPC.Document document, boolean z10) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f10;
        e6 e6Var;
        double d;
        e6 e6Var2;
        PointF pointF;
        boolean isTextColorEmoji;
        ArrayList arrayList;
        yf.s0 s0Var;
        e6 e6Var3;
        int i10;
        float f11;
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
        float f12 = 0.75f;
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f10 = -(cropState.transformRotation + cropState.cropRotate);
            f12 = 0.75f / cropState.cropScale;
        } else {
            f10 = 0.0f;
        }
        e6 e6Var4 = new e6(g0(), f12, f10);
        f0 f0Var = this.V0;
        if (tL_maskCoords == null || (arrayList = this.j1) == null || arrayList.size() == 0) {
            e6Var = e6Var4;
            d = 0.5d;
        } else {
            int i12 = tL_maskCoords.n;
            long j10 = document.id;
            if (i12 >= 0 && i12 <= 3 && !this.j1.isEmpty()) {
                int size = this.j1.size();
                int nextInt = Utilities.random.nextInt(size);
                int i13 = size;
                loop1: while (i13 > 0) {
                    yf.s0 s0Var2 = (yf.s0) this.j1.get(nextInt);
                    if (s0Var2.a(i12) != null) {
                        d = 0.5d;
                        float f13 = s0Var2.a * 1.1f;
                        int i14 = 0;
                        while (i14 < f0Var.getChildCount()) {
                            View childAt = f0Var.getChildAt(i14);
                            yf.s0 s0Var3 = s0Var2;
                            if (childAt instanceof o2) {
                                o2 o2Var = (o2) childAt;
                                if (o2Var.getAnchor() == i12) {
                                    PointF position = o2Var.getPosition();
                                    e6Var3 = e6Var4;
                                    i10 = size;
                                    f11 = f13;
                                    float hypot = (float) Math.hypot(position.x - r4.x, position.y - r4.y);
                                    if ((j10 == o2Var.getSticker().id || this.j1.size() > 1) && hypot < f11) {
                                        break;
                                    }
                                    i14++;
                                    s0Var2 = s0Var3;
                                    e6Var4 = e6Var3;
                                    size = i10;
                                    f13 = f11;
                                }
                            }
                            e6Var3 = e6Var4;
                            i10 = size;
                            f11 = f13;
                            i14++;
                            s0Var2 = s0Var3;
                            e6Var4 = e6Var3;
                            size = i10;
                            f13 = f11;
                        }
                        e6Var = e6Var4;
                        s0Var = s0Var2;
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
            s0Var = null;
            if (s0Var != null) {
                PointF a2 = s0Var.a(i12);
                float f14 = i12 == 1 ? s0Var.e : s0Var.a;
                float f15 = s0Var.b;
                float floor = (float) ((f14 / ((float) Math.floor(getPaintingSize().a * d))) * tL_maskCoords.zoom);
                double radians = (float) Math.toRadians(f15);
                double d10 = 1.5707963267948966d - radians;
                double d11 = f14;
                float sin = (float) (Math.sin(d10) * d11 * tL_maskCoords.x);
                float cos = (float) (Math.cos(d10) * d11 * tL_maskCoords.x);
                double d12 = radians + 1.5707963267948966d;
                e6Var2 = new e6(new PointF(a2.x + sin + ((float) (Math.cos(d12) * d11 * tL_maskCoords.y)), a2.y + cos + ((float) (Math.sin(d12) * d11 * tL_maskCoords.y))), floor, f15);
                Context context = getContext();
                float floor2 = (float) Math.floor(getPaintingSize().a * d);
                tu0 tu0Var = new tu0(floor2, floor2);
                pointF = e6Var2.a;
                y yVar = new y(this, context, pointF, e6Var2.c, e6Var2.b, tu0Var, document, obj);
                isTextColorEmoji = MessageObject.isTextColorEmoji(document);
                ImageReceiver imageReceiver = yVar.t0;
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
                    p0(yVar);
                    r0(yVar, true);
                }
                return yVar;
            }
        }
        e6Var2 = e6Var;
        Context context2 = getContext();
        float floor22 = (float) Math.floor(getPaintingSize().a * d);
        tu0 tu0Var2 = new tu0(floor22, floor22);
        pointF = e6Var2.a;
        y yVar2 = new y(this, context2, pointF, e6Var2.c, e6Var2.b, tu0Var2, document, obj);
        isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver2 = yVar2.t0;
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

    @Override // zf.h
    public final boolean j(j jVar) {
        return r0(jVar, true);
    }

    public final v2 j0(boolean z10) {
        ((ys0) this).k2.c0.isFocusable();
        tu0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        v2 v2Var = new v2(getContext(), A0, (int) (paintingSize.a / 9.0f), "", this.G1, this.Q0);
        float f10 = paintingSize.a / 9.0f;
        n nVar = new n(this, 2);
        v2Var.s0 = (int) (0.5f * f10);
        v2Var.t0 = (int) (f10 * 2.0f);
        v2Var.u0 = nVar;
        float f11 = A0.x;
        f0 f0Var = this.V0;
        if (f11 == f0Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (A0.y == f0Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i10 = this.L1;
        v2Var.setTypeface(yf.r0.e(i10).j);
        v2Var.setType(yf.r0.e(i10).h);
        f0Var.addView(v2Var, z5.c(-2.0f, -2));
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            v2Var.j(1.0f / cropState.cropScale);
            v2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            p0(v2Var);
            v2Var.q();
            r0(v2Var, false);
            v2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(v2Var.getFocusedView());
            this.P0 = true;
            int i11 = yf.r0.e(i10).g;
            o1 o1Var = this.q1;
            o1Var.d(i11, true);
            o1Var.setOutlineType(yf.r0.e(i10).h);
        }
        return v2Var;
    }

    public final int[] k0(j jVar) {
        float[] fArr = this.Z1;
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
        int[] iArr = this.a2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        float f10 = iArr[0];
        Point point = AndroidUtilities.displaySize;
        float f11 = round2 - (point.y / 2.0f);
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d10 = f11;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) i0.a.b(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    @Override // zf.q1
    public final void l(yf.m mVar) {
        boolean z10 = mVar instanceof yf.b;
        w1 w1Var = this.h1;
        if (z10 || (mVar instanceof yf.d)) {
            w1Var.b(0.4f, 1.75f);
        } else {
            w1Var.b(0.05f, 1.0f);
        }
        w1Var.setDrawCenter(!(mVar instanceof yf.l));
        b0 b0Var = this.S0;
        if (b0Var.getCurrentBrush() instanceof yf.l) {
            this.g1 = true;
        }
        b0Var.setBrush(mVar);
        yf.p1 p1Var = this.G1;
        int i10 = p1Var.a;
        p1Var.a = yf.r0.e(this.L1).c();
        p1Var.c = this.i1.get();
        s0(p1Var, Integer.valueOf(i10));
        this.T0.invalidate();
    }

    public final void l0(boolean z10) {
        int i10 = 0;
        if (this.c2) {
            x0(0);
        }
        if (z10) {
            yy yyVar = this.b2;
            if (yyVar == null || yyVar.getVisibility() != 0) {
                m0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.b2.getMeasuredHeight());
            ofFloat.addUpdateListener(new o(this, i10));
            this.e2 = true;
            ofFloat.addListener(new z(this, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.w);
            ofFloat.start();
        }
    }

    public final void m0() {
        yy yyVar;
        a4 a4Var;
        if (this.f2 > 0 && (a4Var = ((ys0) this).k2.G1) != null) {
            a4Var.a();
        }
        if (!this.c2 && (yyVar = this.b2) != null && yyVar.getVisibility() != 8) {
            this.b2.setVisibility(8);
        }
        this.f2 = 0;
    }

    public final boolean n(MotionEvent motionEvent) {
        if (this.O0 != null) {
            r0(null, true);
        }
        float x8 = motionEvent.getX();
        b0 b0Var = this.S0;
        float translationX = ((x8 - b0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / b0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - b0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / b0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-b0Var.getRotation());
        double d10 = y10;
        float measuredWidth = (b0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (b0Var.getMeasuredHeight() / 2.0f) + ((float) i0.a.b(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        b0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final void n0(boolean z10) {
        if (this.c1 == 0) {
            this.h1.setLayerType(z10 ? 2 : 0, null);
            this.Y0.setLayerType(z10 ? 2 : 0, null);
            this.X0.setLayerType(z10 ? 2 : 0, null);
        }
    }

    public final boolean o0() {
        if (this.H1) {
            w0(false);
            return true;
        }
        if (this.c2) {
            l0(true);
            return true;
        }
        if (!this.P0) {
            return false;
        }
        r0(null, true);
        return true;
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.av0, org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (this.b2 != null) {
            int measuredHeight = AndroidUtilities.isTablet() ? i15 - this.b2.getMeasuredHeight() : (R() + i15) - this.b2.getMeasuredHeight();
            yy yyVar = this.b2;
            yyVar.layout(0, measuredHeight, yyVar.getMeasuredWidth(), this.b2.getMeasuredHeight() + measuredHeight);
        }
        int i16 = this.R0 ? 0 : AndroidUtilities.statusBarHeight;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16;
        b0 b0Var = this.S0;
        int ceil = (int) Math.ceil((i14 - b0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.y1.C(8.0f, (((i15 - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - b0Var.getMeasuredHeight()) / 2, i16);
        b0Var.layout(ceil, additionalTop, b0Var.getMeasuredWidth() + ceil, b0Var.getMeasuredHeight() + additionalTop);
        d0 d0Var = this.T0;
        d0Var.layout(ceil, additionalTop, d0Var.getMeasuredWidth() + ceil, d0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = b0Var.getMeasuredWidth();
        f0 f0Var = this.V0;
        int measuredWidth2 = ((measuredWidth - f0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight2 = ((b0Var.getMeasuredHeight() - f0Var.getMeasuredHeight()) / 2) + additionalTop;
        f0Var.layout(measuredWidth2, measuredHeight2, f0Var.getMeasuredWidth() + measuredWidth2, f0Var.getMeasuredHeight() + measuredHeight2);
        f01 f01Var = this.W0;
        if (f01Var != null) {
            f01Var.layout(measuredWidth2, measuredHeight2, f0Var.getMeasuredWidth() + measuredWidth2, f0Var.getMeasuredHeight() + measuredHeight2);
        }
        g0 g0Var = this.U0;
        g0Var.layout(ceil, additionalTop, g0Var.getMeasuredWidth() + ceil, g0Var.getMeasuredHeight() + additionalTop);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f10;
        this.L0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.z0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f10 = size;
        }
        float f11 = size;
        float floor = (float) Math.floor((f11 * currentActionBarHeight) / f10);
        float f12 = currentActionBarHeight2;
        if (floor > f12) {
            f11 = (float) Math.floor((f10 * f12) / currentActionBarHeight);
            floor = f12;
        }
        int i12 = (int) f11;
        int i13 = (int) floor;
        this.S0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        this.T0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        float f13 = f11 / this.N0.a;
        this.M0 = f13;
        f0 f0Var = this.V0;
        f0Var.setScaleX(f13);
        f0Var.setScaleY(this.M0);
        f0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.N0.b, TLObject.FLAG_30));
        f01 f01Var = this.W0;
        if (f01Var != null) {
            f01Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.N0.b, TLObject.FLAG_30));
            this.W0.setScaleX(this.M0);
            this.W0.setScaleY(this.M0);
        }
        C0();
        this.U0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        measureChild(this.Y0, i10, i11);
        measureChild(this.h1, i10, i11);
        measureChild(this.a1, i10, i11);
        measureChild(this.Z0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f2), TLObject.FLAG_30));
        FrameLayout frameLayout = this.X0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.L0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.c2 && !this.e2) {
            this.L0 = true;
            m0();
            this.L0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        yy yyVar = this.b2;
        if (yyVar != null) {
            measureChild(yyVar, i10, i11);
        }
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.B0.b(jVar.getUUID(), new s(this, jVar, 0));
    }

    public final void q0(j jVar) {
        j jVar2 = this.O0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.i0, false);
            this.O0 = null;
            if (jVar instanceof v2) {
                ValueAnimator valueAnimator = this.f1;
                if (valueAnimator != null && this.d1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.V0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            yf.s1 s1Var = this.B0;
            s1Var.b.remove(uuid);
            s1Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new qf.b(s1Var, 22));
        }
        w1 w1Var = this.h1;
        n2.b0 b0Var = this.i1;
        w1Var.setValueOverride(b0Var);
        w1Var.setShowPreview(true);
        float f10 = b0Var.get();
        yf.p1 p1Var = this.G1;
        p1Var.c = f10;
        s0(p1Var, null);
    }

    @Override // zf.h
    public final /* synthetic */ boolean r() {
        return true;
    }

    public final boolean r0(j jVar, boolean z10) {
        l0 l0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof v2;
        int i11 = 2;
        if (z12 && (((i10 = this.d1) == -1 && this.c1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.H1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            v2 v2Var = (v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            o1 o1Var = this.q1;
            o1Var.setAlignment(i11);
            o1Var.setTypeface(v2Var.getTypeface().a);
            o1Var.e(v2Var.getType(), true);
            this.Z0.invalidate();
        }
        j jVar2 = this.O0;
        if (jVar2 == null) {
            l0Var = this;
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!this.P0) {
                    int[] k02 = k0(jVar2);
                    y0(new s(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof v2) {
                    AndroidUtilities.showKeyboard(((v2) jVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            l0Var = this;
            jVar2.l(jVar2.i0, false);
            j jVar3 = l0Var.O0;
            if (jVar3 instanceof v2) {
                v2 v2Var2 = (v2) jVar3;
                u2 u2Var = v2Var2.m0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    l0Var.P0 = false;
                    AndroidUtilities.hideKeyboard(((v2) l0Var.O0).getFocusedView());
                    l0(false);
                }
            }
            z11 = true;
        }
        j jVar4 = l0Var.O0;
        l0Var.O0 = jVar;
        if ((jVar4 instanceof v2) && TextUtils.isEmpty(((v2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = l0Var.O0;
        n2.b0 b0Var = l0Var.i1;
        yf.p1 p1Var = l0Var.G1;
        w1 w1Var = l0Var.h1;
        if (jVar5 == null) {
            ValueAnimator valueAnimator2 = l0Var.f1;
            if (valueAnimator2 != null && l0Var.d1 != 0) {
                valueAnimator2.cancel();
            }
            if (l0Var.H1) {
                w0(false);
            }
            B0(0);
            w1Var.setValueOverride(b0Var);
            w1Var.setShowPreview(true);
            p1Var.c = b0Var.get();
            s0(p1Var, null);
            return z11;
        }
        g0 g0Var = l0Var.U0;
        jVar5.i0 = g0Var;
        jVar5.l(g0Var, true);
        l0Var.V0.bringChildToFront(l0Var.O0);
        j jVar6 = l0Var.O0;
        if (!(jVar6 instanceof v2)) {
            w1Var.setValueOverride(b0Var);
            w1Var.setShowPreview(true);
            p1Var.c = b0Var.get();
            s0(p1Var, null);
            return true;
        }
        v2 v2Var3 = (v2) jVar6;
        v2Var3.v0 = false;
        v2Var3.getSwatch().c = p1Var.c;
        s0(v2Var3.getSwatch(), null);
        w1Var.setValueOverride(new j5(v2Var3, (int) (l0Var.N0.a / 9.0f), 1));
        w1Var.setShowPreview(false);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.L0) {
            return;
        }
        super.requestLayout();
    }

    @Override // zf.h
    public final boolean s() {
        return !this.P0;
    }

    public final void s0(yf.p1 p1Var, Integer num) {
        yf.p1 p1Var2 = this.G1;
        if (p1Var2 != p1Var) {
            p1Var2.a = p1Var.a;
            p1Var2.b = p1Var.b;
            p1Var2.c = p1Var.c;
            int i10 = this.L1;
            yf.r0.e(i10).h(p1Var.a, true);
            yf.r0.e(i10).j(p1Var.c);
        }
        int i11 = p1Var.a;
        b0 b0Var = this.S0;
        b0Var.setColor(i11);
        b0Var.setBrushSize(p1Var.c);
        int i12 = p1Var2.a;
        if (num == null || num.intValue() == i12) {
            j0 j0Var = this.Y0;
            if (j0Var != null) {
                j0Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new n4(this, num, i12, 2));
            duration.start();
        }
        j jVar = this.O0;
        if (jVar instanceof v2) {
            ((v2) jVar).setSwatch(new yf.p1(p1Var.b, p1Var.c, p1Var.a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(lg.d dVar) {
        dVar.o(AndroidUtilities.dp(4.0f));
        this.Y1 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.S1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f10) {
        if (this.c1 == 0) {
            this.h1.setTranslationX(f10);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.Q1 = runnable;
    }

    public final void t0(float f10) {
        this.y0 = f10;
        this.X0.setTranslationY(-f10);
        this.Y0.setTranslationY(f10);
    }

    @Override // zf.m1
    public final void u() {
        a4 a4Var;
        if (!this.d2 && !this.c2) {
            j0(true);
            return;
        }
        boolean z10 = this.c2;
        if (z10 && (a4Var = ((ys0) this).k2.G1) != null) {
            a4Var.e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.O0;
            if (jVar instanceof v2) {
                AndroidUtilities.showKeyboard(((v2) jVar).getEditText());
            }
        }
    }

    @Override // zf.h
    public final void v(float f10, float f11, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d10 = f11 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) i0.a.b(radians, d10, Math.sin(radians) * d));
    }

    public final void v0(float f10, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        this.E0 = f10;
        this.J0 = f13;
        this.K0 = f14;
        this.F0 = f11;
        this.G0 = f12;
        this.H0 = f11;
        float f19 = f12 + 0.0f;
        this.I0 = f19;
        int i10 = 0;
        while (i10 < 4) {
            View view = i10 == 0 ? this.V0 : i10 == 1 ? this.U0 : i10 == 2 ? this.S0 : this.T0;
            MediaController.CropState cropState = this.D0;
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
                float max = Math.max(f13 / ((int) (cropState.cropPw * r12)), f14 / ((int) (cropState.cropPh * r13)));
                f15 = f20 * max;
                float C = com.google.android.recaptcha.internal.a.C(cropState.cropPx, measuredWidth, f10, max);
                float f21 = cropState.cropScale;
                f16 = (C * f21) + f11;
                f17 = (cropState.cropPy * measuredHeight * f10 * max * f21) + f19;
                f18 = cropState.cropRotate + i11;
            } else {
                f15 = i10 == 0 ? this.M0 * 1.0f : 1.0f;
                f16 = f11;
                f17 = f19;
                f18 = 0.0f;
            }
            float f22 = ((-this.f2) / 2.0f) + f17;
            float f23 = f10 * f15;
            if (Float.isNaN(f23)) {
                f23 = 1.0f;
            }
            view.setScaleX(f23);
            view.setScaleY(f23);
            view.setTranslationX(f16);
            view.setTranslationY(f22);
            view.setRotation(f18);
            view.invalidate();
            i10++;
        }
        C0();
        invalidate();
    }

    @Override // zf.h
    public final int[] w(j jVar) {
        return k0(jVar);
    }

    public final void w0(final boolean z10) {
        if (this.H1 != z10) {
            this.H1 = z10;
            o1.j jVar = this.I1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new hb.a(z10 ? 0.0f : 1000.0f));
            this.I1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            int i10 = 1;
            final boolean[] zArr = {this.d2 || this.c2};
            final float translationY = this.Y0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.I1.b(new o1.g() { // from class: zf.t
                @Override // o1.g
                public final void a(o1.h hVar, float f10, float f11) {
                    l0 l0Var = l0.this;
                    j0 j0Var = l0Var.Y0;
                    float f12 = f10 / 1000.0f;
                    l0Var.J1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(l0Var.J1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(l0Var.J1, 0.25f) / 0.25f));
                    i0 i0Var = l0Var.C1;
                    float f14 = l0Var.J1;
                    boolean z11 = z10;
                    i0Var.y1(f14, z11);
                    l0Var.x0.setProgress(l0Var.J1);
                    l0Var.w0.setProgress(l0Var.J1);
                    l0Var.b1.setTranslationY(AndroidUtilities.dp(32.0f) * l0Var.J1);
                    if (zArr[0]) {
                        float f15 = l0Var.J1;
                        if (!z11) {
                            f15 = 1.0f - f15;
                        }
                        j0Var.setTranslationY(translationY - ((AndroidUtilities.dp(40.0f) * f15) * (z11 ? 1 : -1)));
                    }
                    j0Var.invalidate();
                    if (view == l0Var.q1) {
                        l0Var.Z0.invalidate();
                    }
                }
            });
            this.I1.a(new r(this, z10, i10));
            this.I1.f();
            if (z10) {
                i0 i0Var = this.C1;
                i0Var.setVisibility(0);
                i0Var.setSelectedColorIndex(yf.r0.e(this.L1).d());
            }
        }
    }

    @Override // zf.q1
    public final yf.r0 x() {
        return yf.r0.e(this.L1);
    }

    public final void x0(int i10) {
        o1 o1Var = this.q1;
        int i11 = 0;
        int i12 = 1;
        if (i10 != 1) {
            mg emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(kg.e, true);
            }
            yy yyVar = this.b2;
            if (yyVar != null) {
                this.c2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    yyVar.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f2 = 0;
            }
            a4 a4Var = ((ys0) this).k2.G1;
            if (a4Var != null) {
                a4Var.a();
            }
            requestLayout();
            getHeight();
            return;
        }
        yy yyVar2 = this.b2;
        boolean z10 = yyVar2 != null && yyVar2.getVisibility() == 0;
        yy yyVar3 = this.b2;
        if (yyVar3 != null && yyVar3.Y0 != UserConfig.selectedAccount) {
            removeView(yyVar3);
            this.b2 = null;
        }
        if (this.b2 == null) {
            yy yyVar4 = new yy(null, true, false, false, getContext(), false, null, null, true, this.M1, false, false);
            this.b2 = yyVar4;
            yyVar4.Q0 = true;
            yyVar4.setVisibility(8);
            if (AndroidUtilities.isTablet()) {
                this.b2.setForseMultiwindowLayout(true);
            }
            this.b2.setDelegate(new a0(this));
            addView(this.b2);
        }
        this.b2.setVisibility(0);
        this.c2 = true;
        yy yyVar5 = this.b2;
        if (this.g2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.g2 = AndroidUtilities.dp(150.0f);
            } else {
                this.g2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            }
        }
        if (this.h2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.h2 = AndroidUtilities.dp(150.0f);
            } else {
                this.h2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
            }
        }
        Point point = AndroidUtilities.displaySize;
        int i13 = point.x > point.y ? this.h2 : this.g2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yyVar5.getLayoutParams();
        layoutParams.height = i13;
        yyVar5.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            j jVar = this.O0;
            if (jVar instanceof v2) {
                AndroidUtilities.hideKeyboard(((v2) jVar).getEditText());
            }
        }
        this.f2 = i13;
        requestLayout();
        a4 a4Var2 = ((ys0) this).k2.G1;
        if (a4Var2 != null) {
            a4Var2.a();
        }
        mg emojiButton2 = o1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(kg.d, true);
        }
        getHeight();
        if (z10 || this.d2) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f2, 0.0f);
        ofFloat.addUpdateListener(new o(this, i12));
        ofFloat.addListener(new z(this, i11));
        ofFloat.start();
    }

    public final void y0(Runnable runnable, l0 l0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.n1 n1Var = this.N1;
        if (n1Var != null && n1Var.isShowing()) {
            this.N1.d(true);
            return;
        }
        if (this.O1 == null) {
            this.P1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.M1);
            this.O1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.O1.setBackgroundColor(-14145495);
            this.O1.setOnTouchListener(new w4(this, 1));
            this.O1.setDispatchKeyEventListener(new q(this));
            this.O1.setShownFromBottom(true);
        }
        this.O1.d();
        runnable.run();
        if (this.N1 == null) {
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(this.O1, -2, -2);
            this.N1 = n1Var2;
            n1Var2.b = true;
            n1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.N1.setOutsideTouchable(true);
            this.N1.setClippingEnabled(true);
            this.N1.setInputMethodMode(2);
            this.N1.setSoftInputMode(0);
            this.N1.getContentView().setFocusableInTouchMode(true);
            this.N1.setOnDismissListener(new y4(this, 1));
        }
        this.O1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.N1.setFocusable(true);
        this.N1.showAtLocation(l0Var, i10, i11 - (this.O1.getMeasuredWidth() / 2), i12 - this.O1.getMeasuredHeight());
        org.telegram.ui.ActionBar.n1.i(this.O1);
    }

    public final void z0(boolean z10) {
        if (this.A1 != z10) {
            this.A1 = z10;
            o1.j jVar = this.B1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new hb.a(z10 ? 0.0f : 1000.0f));
            this.B1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            if (z10) {
                t1 t1Var = this.r1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.B1.b(new t7(3, this));
            this.B1.a(new r(this, z10, 0));
            this.B1.f();
        }
    }

    @Override // zf.h
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // zf.h
    public final /* synthetic */ void C() {
    }

    @Override // zf.h
    public final /* synthetic */ void g(boolean z10) {
    }

    public View getView() {
        return this;
    }

    @Override // zf.h
    public final /* synthetic */ void h(boolean z10) {
    }

    @Override // zf.h
    public final /* synthetic */ void k() {
    }

    @Override // zf.h
    public final /* synthetic */ void m() {
    }

    @Override // zf.h
    public final /* synthetic */ void o(boolean z10) {
    }

    @Override // zf.h
    public final /* synthetic */ void y() {
    }
}
