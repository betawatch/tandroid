package qg;

import ai.qa;
import ai.x4;
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
import ci.d5;
import ci.h5;
import ci.j4;
import ci.j5;
import ci.q6;
import ci.u5;
import ci.x5;
import ci.y5;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.zg;
import org.telegram.ui.cu0;
import org.telegram.ui.kr0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class p0 extends rv0 implements t1, h, p1, pv0, NotificationCenter.NotificationCenterDelegate {
    public final i1 A0;
    public final TextView A1;
    public final m1 B0;
    public final Paint B1;
    public float C0;
    public final Paint C1;
    public final Bitmap D0;
    public float D1;
    public final Bitmap E0;
    public boolean E1;
    public final pg.t1 F0;
    public o1.k F1;
    public final DispatchQueue G0;
    public final l0 G1;
    public final MediaController.CropState H0;
    public final Paint H1;
    public float I0;
    public final Paint I1;
    public float J0;
    public final Paint J1;
    public float K0;
    public final pg.q1 K1;
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
    public final eh.a Q1;
    public kv0 R0;
    public org.telegram.ui.ActionBar.o1 R1;
    public j S0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout S1;
    public boolean T0;
    public Rect T1;
    public int U0;
    public Runnable U1;
    public final boolean V0;
    public final pg.s0 V1;
    public final e0 W0;
    public boolean W1;
    public final g0 X0;
    public float X1;
    public final j0 Y0;
    public boolean Y1;
    public final i0 Z0;
    public final c6 Z1;
    public y01 a1;
    public final Paint a2;
    public final FrameLayout b1;
    public final Paint b2;
    public final m0 c1;
    public ch.d c2;
    public final k0 d1;
    public final float[] d2;
    public final FrameLayout e1;
    public final int[] e2;
    public x5 f1;
    public kz f2;
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
    public final z1 l1;
    public int l2;
    public final k2.c0 m1;
    public int m2;
    public ArrayList n1;
    public boolean n2;
    public final int o1;
    public BigInteger p1;
    public TextView q1;
    public TextView r1;
    public TextView s1;
    public final u1 t1;
    public final r1 u1;
    public final w1 v1;
    public final ImageView w1;
    public final LinearLayout x1;
    public final TextView y1;
    public final TextView z1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [qg.x2] */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.view.View, qg.a0, qg.q2] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Components.pv0, org.telegram.ui.Components.qv0, qg.p0, qg.p1, qg.t1] */
    public p0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, kr0 kr0Var, f6 f6Var) {
        super(context, activity);
        float f7;
        int i12;
        int i13;
        a2 a2Var;
        Emoji.EmojiSpan[] emojiSpanArr;
        boolean z10 = false;
        this.g1 = 0;
        this.h1 = -1;
        final cu0 cu0Var = (cu0) this;
        this.m1 = new k2.c0(cu0Var, 20);
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.H1 = new Paint(1);
        this.I1 = new Paint(1);
        this.J1 = new Paint(1);
        pg.q1 q1Var = new pg.q1(1.0f, 0.016773745f, -1);
        this.K1 = q1Var;
        this.O1 = new Paint(1);
        this.Y1 = false;
        this.Z1 = new c6((View) this, 350L, qr.h);
        this.a2 = new Paint(1);
        Paint paint = new Paint(1);
        this.b2 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.d2 = new float[2];
        this.e2 = new int[2];
        new b0(cu0Var, false ? 1 : 0);
        setDelegate(this);
        this.P1 = i10;
        this.Q1 = new eh.a(3, f6Var);
        this.H0 = cropState;
        this.V0 = context instanceof BubbleActivity;
        pg.s0 e = pg.s0.e(i10);
        this.V1 = e;
        e.i(0, true);
        q1Var.a = e.c();
        q1Var.c = e.i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.G0 = dispatchQueue;
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.o1 = i11;
        pg.t1 t1Var = new pg.t1();
        this.F0 = t1Var;
        t1Var.a = new k2.v(cu0Var, 19);
        e0 e0Var = new e0(cu0Var, context, new pg.q0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.W0 = e0Var;
        e0Var.setDelegate(new f0(cu0Var, kr0Var));
        e0Var.setUndoStore(t1Var);
        e0Var.setQueue(dispatchQueue);
        e0Var.setVisibility(4);
        addView(e0Var, w7.x5.e(-1, -1, 51));
        g0 g0Var = new g0(cu0Var, context);
        this.X0 = g0Var;
        g0Var.setVisibility(4);
        addView(g0Var, w7.x5.e(-1, -1, 51));
        i0 i0Var = new i0(cu0Var, context, new h0(cu0Var));
        this.Z0 = i0Var;
        addView(i0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i14);
                byte b10 = mediaEntity.type;
                if (b10 == 0) {
                    f7 = 2.0f;
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z10);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    i13 = i14;
                    a2Var = i02;
                } else {
                    f7 = 2.0f;
                    if (b10 == 1) {
                        ?? j02 = j0(z10);
                        j02.setType(mediaEntity.subType);
                        j02.setTypeface(mediaEntity.textTypeface);
                        j02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i15);
                            i15++;
                            VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                            int i16 = size2;
                            org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(emojiEntity2.document_id, j02.getFontMetricsInt());
                            int i17 = emojiEntity2.offset;
                            spannableString.setSpan(x5Var, i17, emojiEntity2.length + i17, 33);
                            size = size;
                            i14 = i14;
                            size2 = i16;
                        }
                        i12 = size;
                        i13 = i14;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        j02.setText(replaceEmoji);
                        u0(j02, mediaEntity.textAlign);
                        pg.q1 swatch = j02.getSwatch();
                        swatch.a = mediaEntity.color;
                        j02.setSwatch(swatch);
                        a2Var = j02;
                    } else {
                        i12 = size;
                        i13 = i14;
                        if (b10 == 2) {
                            a2 h02 = h0(mediaEntity.text, false);
                            h02.B0 = false;
                            if ((mediaEntity.subType & 2) != 0) {
                                h02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            a2Var = h02;
                        } else {
                            i14 = i13 + 1;
                            size = i12;
                            z10 = false;
                        }
                    }
                }
                a2Var.setX((mediaEntity.x * this.R0.a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / f7));
                a2Var.setY((mediaEntity.y * this.R0.b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / f7));
                a2Var.setPosition(new PointF((mediaEntity.viewWidth / f7) + a2Var.getX(), (mediaEntity.viewHeight / f7) + a2Var.getY()));
                a2Var.setScale(mediaEntity.scale);
                a2Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i14 = i13 + 1;
                size = i12;
                z10 = false;
            }
        }
        this.Z0.setVisibility(4);
        j0 j0Var = new j0(context);
        this.Y0 = j0Var;
        addView(j0Var);
        ?? frameLayout = new FrameLayout(context);
        this.b1 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, w7.x5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.w1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(j6.f0(1090519039, 1, -1));
        final int i18 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: qg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        cu0 cu0Var2 = cu0Var;
                        e0 e0Var2 = cu0Var2.W0;
                        if (e0Var2 != null && (e0Var2.getCurrentBrush() instanceof pg.l)) {
                            e0Var2.b();
                            cu0Var2.t1.setSelectedIndex(1);
                            cu0Var2.b((pg.m) pg.m.a.get(0));
                            break;
                        } else {
                            cu0Var2.F0.c();
                            break;
                        }
                        break;
                    case 1:
                        cu0 cu0Var3 = cu0Var;
                        e0 e0Var3 = cu0Var3.W0;
                        pg.t1 t1Var2 = cu0Var3.F0;
                        if (t1Var2.a()) {
                            if (e0Var3 != null && (e0Var3.getCurrentBrush() instanceof pg.l)) {
                                e0Var3.b();
                                cu0Var3.t1.setSelectedIndex(1);
                                cu0Var3.b((pg.m) pg.m.a.get(0));
                            }
                            e0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(t1Var2, 12));
                            cu0Var3.Z0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        cu0 cu0Var4 = cu0Var;
                        j jVar = cu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (cu0Var4.g2) {
                            cu0Var4.l0(false);
                        }
                        cu0Var4.q0(cu0Var4.S0);
                        cu0Var4.r0(null, true);
                        break;
                    default:
                        cu0Var.r0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, w7.x5.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.x1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(j6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        wl.j(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, w7.x5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, w7.x5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ai.e2(22));
        frameLayout.addView(linearLayout, w7.x5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.y1 = textView2;
        textView2.setBackground(j6.f0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i19 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: qg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        cu0 cu0Var2 = cu0Var;
                        e0 e0Var2 = cu0Var2.W0;
                        if (e0Var2 != null && (e0Var2.getCurrentBrush() instanceof pg.l)) {
                            e0Var2.b();
                            cu0Var2.t1.setSelectedIndex(1);
                            cu0Var2.b((pg.m) pg.m.a.get(0));
                            break;
                        } else {
                            cu0Var2.F0.c();
                            break;
                        }
                        break;
                    case 1:
                        cu0 cu0Var3 = cu0Var;
                        e0 e0Var3 = cu0Var3.W0;
                        pg.t1 t1Var2 = cu0Var3.F0;
                        if (t1Var2.a()) {
                            if (e0Var3 != null && (e0Var3.getCurrentBrush() instanceof pg.l)) {
                                e0Var3.b();
                                cu0Var3.t1.setSelectedIndex(1);
                                cu0Var3.b((pg.m) pg.m.a.get(0));
                            }
                            e0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(t1Var2, 12));
                            cu0Var3.Z0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        cu0 cu0Var4 = cu0Var;
                        j jVar = cu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (cu0Var4.g2) {
                            cu0Var4.l0(false);
                        }
                        cu0Var4.q0(cu0Var4.S0);
                        cu0Var4.r0(null, true);
                        break;
                    default:
                        cu0Var.r0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView f10 = p6.f(frameLayout, textView2, w7.x5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.z1 = f10;
        f10.setBackground(j6.f0(822083583, 7, -1));
        f10.setPadding(p6.b(8.0f, R.string.Clear, f10), 0, AndroidUtilities.dp(8.0f), 0);
        f10.setGravity(16);
        f10.setTextColor(-1);
        f10.setTypeface(AndroidUtilities.bold());
        f10.setTextSize(1, 16.0f);
        final int i20 = 2;
        f10.setOnClickListener(new View.OnClickListener() { // from class: qg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        cu0 cu0Var2 = cu0Var;
                        e0 e0Var2 = cu0Var2.W0;
                        if (e0Var2 != null && (e0Var2.getCurrentBrush() instanceof pg.l)) {
                            e0Var2.b();
                            cu0Var2.t1.setSelectedIndex(1);
                            cu0Var2.b((pg.m) pg.m.a.get(0));
                            break;
                        } else {
                            cu0Var2.F0.c();
                            break;
                        }
                        break;
                    case 1:
                        cu0 cu0Var3 = cu0Var;
                        e0 e0Var3 = cu0Var3.W0;
                        pg.t1 t1Var2 = cu0Var3.F0;
                        if (t1Var2.a()) {
                            if (e0Var3 != null && (e0Var3.getCurrentBrush() instanceof pg.l)) {
                                e0Var3.b();
                                cu0Var3.t1.setSelectedIndex(1);
                                cu0Var3.b((pg.m) pg.m.a.get(0));
                            }
                            e0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(t1Var2, 12));
                            cu0Var3.Z0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        cu0 cu0Var4 = cu0Var;
                        j jVar = cu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (cu0Var4.g2) {
                            cu0Var4.l0(false);
                        }
                        cu0Var4.q0(cu0Var4.S0);
                        cu0Var4.r0(null, true);
                        break;
                    default:
                        cu0Var.r0(null, true);
                        break;
                }
            }
        });
        f10.setAlpha(0.0f);
        f10.setVisibility(8);
        TextView f11 = p6.f(frameLayout, f10, w7.x5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.A1 = f11;
        f11.setBackground(j6.f0(822083583, 7, -1));
        f11.setPadding(p6.b(8.0f, R.string.Done, f11), 0, AndroidUtilities.dp(8.0f), 0);
        f11.setGravity(16);
        f11.setTextColor(-1);
        f11.setTypeface(AndroidUtilities.bold());
        f11.setTextSize(1, 16.0f);
        final int i21 = 3;
        f11.setOnClickListener(new View.OnClickListener() { // from class: qg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        cu0 cu0Var2 = cu0Var;
                        e0 e0Var2 = cu0Var2.W0;
                        if (e0Var2 != null && (e0Var2.getCurrentBrush() instanceof pg.l)) {
                            e0Var2.b();
                            cu0Var2.t1.setSelectedIndex(1);
                            cu0Var2.b((pg.m) pg.m.a.get(0));
                            break;
                        } else {
                            cu0Var2.F0.c();
                            break;
                        }
                        break;
                    case 1:
                        cu0 cu0Var3 = cu0Var;
                        e0 e0Var3 = cu0Var3.W0;
                        pg.t1 t1Var2 = cu0Var3.F0;
                        if (t1Var2.a()) {
                            if (e0Var3 != null && (e0Var3.getCurrentBrush() instanceof pg.l)) {
                                e0Var3.b();
                                cu0Var3.t1.setSelectedIndex(1);
                                cu0Var3.b((pg.m) pg.m.a.get(0));
                            }
                            e0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(t1Var2, 12));
                            cu0Var3.Z0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        cu0 cu0Var4 = cu0Var;
                        j jVar = cu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (cu0Var4.g2) {
                            cu0Var4.l0(false);
                        }
                        cu0Var4.q0(cu0Var4.S0);
                        cu0Var4.r0(null, true);
                        break;
                    default:
                        cu0Var.r0(null, true);
                        break;
                }
            }
        });
        f11.setAlpha(0.0f);
        f11.setVisibility(8);
        frameLayout.addView(f11, w7.x5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        m0 m0Var = new m0(cu0Var, context);
        this.c1 = m0Var;
        m0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        m0Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(m0Var, w7.x5.e(-1, 104, 80));
        u1 u1Var = new u1(context, bitmap2 != null);
        this.t1 = u1Var;
        u1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        u1Var.setDelegate(this);
        u1Var.setSelectedIndex(1);
        m0Var.addView(u1Var, w7.x5.c(48.0f, -1));
        r1 r1Var = new r1(context);
        this.u1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setVisibility(8);
        r1Var.setDelegate(this);
        r1Var.setAlignment(pg.s0.e(i10).g);
        m0Var.addView(r1Var, w7.x5.c(48.0f, -1));
        k0 k0Var = new k0(cu0Var, context);
        this.d1 = k0Var;
        addView(k0Var, w7.x5.c(-1.0f, -1));
        w1 w1Var = new w1(context);
        this.v1 = w1Var;
        w1Var.setVisibility(8);
        w1Var.setOnItemClickListener(new ai.g(cu0Var, 14));
        r1Var.setTypefaceListView(w1Var);
        k0Var.addView(w1Var, w7.x5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.B1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.B1.setColor(1728053247);
        this.B1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.C1.setColor(j6.v0(j6.G8, this.Q1));
        l0 l0Var = new l0(cu0Var, context);
        this.G1 = l0Var;
        l0Var.setVisibility(8);
        l0Var.setColorPalette(pg.s0.e(i10));
        l0Var.setColorListener(new m(cu0Var, 0));
        m0Var.addView(l0Var, w7.x5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        i1 i1Var = new i1(context);
        this.A0 = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        i1Var.setBackground(j6.f0(1090519039, 1, -1));
        m0Var.addView(i1Var, w7.x5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        m1 m1Var = new m1(context);
        this.B0 = m1Var;
        m1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        m1Var.setBackground(j6.f0(1090519039, 1, -1));
        m1Var.setOnClickListener(new ai.d0(cu0Var, context, bitmap2, 29));
        m0Var.addView(m1Var, w7.x5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        z1 z1Var = new z1(context);
        this.l1 = z1Var;
        z1Var.setColorSwatch(this.K1);
        z1Var.setRenderView(this.W0);
        z1Var.setValueOverride(this.m1);
        this.K1.c = this.m1.get();
        z1Var.setOnUpdate(new v(cu0Var, i10, 0));
        addView(z1Var, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e1 = frameLayout2;
        addView(frameLayout2, w7.x5.c(-1.0f, -1));
        this.J1.setStyle(style);
        this.J1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.K1, null);
        b((pg.m) pg.m.a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static /* synthetic */ void Z(cu0 cu0Var, Integer num) {
        cu0Var.setNewColor(num.intValue());
        cu0Var.w0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[Catch: all -> 0x002c, Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:4:0x0003, B:6:0x0022, B:8:0x0026, B:12:0x0036, B:14:0x005b, B:17:0x0062, B:18:0x0069, B:21:0x006e, B:22:0x0078, B:24:0x007e, B:26:0x0092, B:30:0x009c, B:34:0x00a8, B:36:0x00ab, B:41:0x00ae, B:46:0x00b5), top: B:3:0x0003, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(p0 p0Var) {
        pg.t0 t0Var;
        boolean z10;
        Bitmap bitmap = p0Var.E0;
        t8.c cVar = null;
        try {
            try {
                t8.b bVar = new t8.b(p0Var.getContext());
                bVar.c(1);
                bVar.b(1);
                bVar.c = false;
                cVar = bVar.a();
                if (!cVar.c.k()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    cVar.U0();
                    return;
                }
                lf.i iVar = new lf.i(22);
                a3.l lVar = (a3.l) iVar.b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                iVar.d = bitmap;
                lVar.a = width;
                lVar.b = height;
                lVar.c = p0Var.getFrameRotation();
                if (((ByteBuffer) iVar.c) == null && ((Bitmap) iVar.d) == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                try {
                    SparseArray Z0 = cVar.Z0(iVar);
                    ArrayList arrayList = new ArrayList();
                    kv0 paintingSize = p0Var.getPaintingSize();
                    for (int i10 = 0; i10 < Z0.size(); i10++) {
                        t8.a aVar = (t8.a) Z0.get(Z0.keyAt(i10));
                        int i11 = p0Var.o1;
                        if (i11 % 360 != 90 && i11 % 360 != 270) {
                            z10 = false;
                            t0Var = new pg.t0(aVar, bitmap, paintingSize, z10);
                            if (!(t0Var.d == null)) {
                                arrayList.add(t0Var);
                            }
                        }
                        z10 = true;
                        t0Var = new pg.t0(aVar, bitmap, paintingSize, z10);
                        if (!(t0Var.d == null)) {
                        }
                    }
                    p0Var.n1 = arrayList;
                    cVar.U0();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    cVar.U0();
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (0 == 0) {
                }
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                cVar.U0();
            }
            throw th3;
        }
    }

    public static void b0(p0 p0Var) {
        j jVar;
        i0 i0Var = p0Var.Z0;
        j jVar2 = p0Var.S0;
        if (jVar2 != null) {
            PointF A0 = p0Var.A0(jVar2);
            j jVar3 = p0Var.S0;
            if (jVar3 instanceof q2) {
                q2 q2Var = new q2(p0Var.getContext(), (q2) p0Var.S0, A0);
                q2Var.setDelegate(p0Var);
                i0Var.addView(q2Var);
                jVar = q2Var;
            } else if (jVar3 instanceof x2) {
                x2 x2Var = new x2(p0Var.getContext(), (x2) p0Var.S0, A0);
                x2Var.setDelegate(p0Var);
                x2Var.setMaxWidth((int) (p0Var.getPaintingSize().a - 20.0f));
                i0Var.addView(x2Var, w7.x5.c(-2.0f, -2));
                jVar = x2Var;
            } else {
                jVar = null;
            }
            p0Var.p0(jVar);
            p0Var.r0(jVar, true);
        }
        org.telegram.ui.ActionBar.o1 o1Var = p0Var.R1;
        if (o1Var == null || !o1Var.isShowing()) {
            return;
        }
        p0Var.R1.d(true);
    }

    public static void c0(cu0 cu0Var, Integer num) {
        pg.s0 s0Var = cu0Var.V1;
        s0Var.h(num.intValue(), true);
        s0Var.g();
        cu0Var.setNewColor(num.intValue());
        l0 l0Var = cu0Var.G1;
        l0Var.setSelectedColorIndex(s0Var.d());
        l0Var.getAdapter().l();
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

    private kv0 getPaintingSize() {
        kv0 kv0Var = this.R0;
        if (kv0Var != null) {
            return kv0Var;
        }
        Bitmap bitmap = this.D0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        int i10 = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
        kv0 kv0Var2 = new kv0(width, height);
        float f7 = i10;
        kv0Var2.a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        kv0Var2.b = floor;
        if (floor > f7) {
            kv0Var2.b = f7;
            kv0Var2.a = (float) Math.floor((f7 * width) / height);
        }
        this.R0 = kv0Var2;
        return kv0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i10) {
        pg.q1 q1Var = this.K1;
        int i11 = q1Var.a;
        q1Var.a = i10;
        s0(q1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new d5(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.U0 = i10;
        j jVar = this.S0;
        if (jVar instanceof x2) {
            ((x2) jVar).setType(i10);
        }
        pg.s0 e = pg.s0.e(this.P1);
        e.h = i10;
        e.a.edit().putInt("text_type", i10).apply();
        this.u1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        x5 x5Var = new x5(this, context);
        this.f1 = x5Var;
        x5Var.setClipToPadding(false);
        this.f1.setOrientation(0);
        this.c1.addView(this.f1, w7.x5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.q1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.q1;
        int i10 = j6.i6;
        eh.a aVar = this.Q1;
        textView2.setBackground(j6.f0(j6.v0(i10, aVar), 7, -1));
        this.q1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.q1.setTextColor(-1);
        this.q1.setTextSize(1, 14.0f);
        this.q1.setGravity(1);
        this.q1.setTypeface(AndroidUtilities.bold());
        this.q1.setSingleLine();
        this.q1.setOnClickListener(new k(this, 0));
        this.f1.addView(this.q1, w7.x5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.r1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.r1.setBackground(j6.f0(j6.v0(i10, aVar), 7, -1));
        this.r1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.r1.setOnClickListener(new k(this, 1));
        this.r1.setTextColor(-1);
        this.r1.setTextSize(1, 14.0f);
        this.r1.setGravity(1);
        this.r1.setTypeface(AndroidUtilities.bold());
        this.r1.setAlpha(0.6f);
        this.r1.setSingleLine();
        this.f1.addView(this.r1, w7.x5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.s1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.s1.setBackground(j6.f0(j6.v0(i10, aVar), 7, -1));
        this.s1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.s1.setTextColor(-1);
        this.s1.setTextSize(1, 14.0f);
        this.s1.setGravity(1);
        this.s1.setTypeface(AndroidUtilities.bold());
        this.s1.setAlpha(0.6f);
        this.s1.setSingleLine();
        this.s1.setOnClickListener(new k(this, 4));
        this.f1.addView(this.s1, w7.x5.l(1.0f, 0, -2));
    }

    public static void u0(x2 x2Var, int i10) {
        x2Var.setAlign(i10);
        int i11 = 2;
        x2Var.getEditText().setGravity(i10 != 1 ? i10 != 2 ? 19 : 21 : 17);
        if (i10 == 1) {
            i11 = 4;
        } else if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i11 = 3;
        }
        x2Var.getEditText().setTextAlignment(i11);
    }

    public final PointF A0(j jVar) {
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
                i0 i0Var = this.Z0;
                if (i10 >= i0Var.getChildCount()) {
                    break;
                }
                View childAt = i0Var.getChildAt(i10);
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

    public final void B0(int i10) {
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
        pg.s0 e = pg.s0.e(i12);
        boolean z10 = i10 == 2;
        if (e.l != z10) {
            e.l = z10;
            if (z10) {
                e.i(-1, false);
            } else {
                e.i(e.a.getInt("brush", 0), false);
            }
        }
        int c10 = pg.s0.e(i12).c();
        pg.q1 q1Var = this.K1;
        q1Var.a = c10;
        s0(q1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.j1 = duration;
        duration.setInterpolator(qr.f);
        this.j1.addUpdateListener(new x4(this, viewGroup3, viewGroup4, 4));
        this.j1.addListener(new y5(this, viewGroup3, viewGroup4, i10, 2));
        this.j1.start();
    }

    @Override // qg.h
    public final int[] C(j jVar) {
        return k0(jVar);
    }

    public final void C0() {
        int i10 = 0;
        while (true) {
            i0 i0Var = this.Z0;
            if (i10 >= i0Var.getChildCount()) {
                return;
            }
            View childAt = i0Var.getChildAt(i10);
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

    @Override // qg.p1
    public final void D() {
        z0(true);
    }

    @Override // org.telegram.ui.Components.pv0
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
                j4 j4Var = ((cu0) this).o2.K1;
                if (j4Var != null) {
                    j4Var.a();
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
        if (jVar instanceof x2) {
            this.h2 = ((x2) jVar).getEditText().isFocused() && i10 > 0;
        } else {
            this.h2 = false;
        }
        if (this.h2 && this.g2) {
            x0(0);
        }
        if (this.j2 != 0 && !(z11 = this.h2) && z11 != z12 && !this.g2) {
            this.j2 = 0;
            requestLayout();
            j4 j4Var2 = ((cu0) this).o2.K1;
            if (j4Var2 != null) {
                j4Var2.a();
            }
        }
        getHeight();
    }

    @Override // qg.t1, qg.p1
    public final void a() {
        w0(true);
    }

    @Override // qg.t1
    public final void b(pg.m mVar) {
        boolean z10 = mVar instanceof pg.b;
        z1 z1Var = this.l1;
        if (z10 || (mVar instanceof pg.d)) {
            z1Var.b(0.4f, 1.75f);
        } else {
            z1Var.b(0.05f, 1.0f);
        }
        z1Var.setDrawCenter(!(mVar instanceof pg.l));
        e0 e0Var = this.W0;
        if (e0Var.getCurrentBrush() instanceof pg.l) {
            this.k1 = true;
        }
        e0Var.setBrush(mVar);
        pg.q1 q1Var = this.K1;
        int i10 = q1Var.a;
        q1Var.a = pg.s0.e(this.P1).c();
        q1Var.c = this.m1.get();
        s0(q1Var, Integer.valueOf(i10));
        this.X0.invalidate();
    }

    @Override // qg.h
    public final boolean d(j jVar) {
        return r0(jVar, true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i0 i0Var;
        x2 x2Var;
        String str;
        if (i10 != NotificationCenter.customTypefacesLoaded || (i0Var = this.Z0) == null) {
            return;
        }
        for (int i12 = 0; i12 < i0Var.getChildCount(); i12++) {
            View childAt = i0Var.getChildAt(i12);
            if ((childAt instanceof x2) && (str = (x2Var = (x2) childAt).A0) != null) {
                x2Var.setTypeface(str);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        MediaController.CropState cropState;
        int i10;
        j0 j0Var;
        i0 i0Var = this.Z0;
        if (view == i0Var) {
            float e = this.Z1.e(this.W1);
            if (e > 0.0f) {
                float dp = AndroidUtilities.dp(24.0f * e);
                int l1 = j6.l1(e, 1090519039);
                Paint paint = this.a2;
                paint.setShadowLayer(dp, 0.0f, 0.0f, l1);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(i0Var.getX(), i0Var.getY());
                canvas.scale(i0Var.getScaleX(), i0Var.getScaleY(), i0Var.getWidth() / 2.0f, i0Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, i0Var.getWidth(), i0Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, i0Var.getWidth(), i0Var.getHeight(), this.b2);
                canvas.restore();
                if ((view != this.W0 || view == this.X0 || ((view == i0Var && i0Var.getClipChildren()) || (view == (j0Var = this.Y0) && j0Var.getClipChildren()))) && (cropState = this.H0) != null) {
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
                boolean drawChild = super.drawChild(canvas, view, j3);
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
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        if (r10 != 0) {
        }
        return drawChild2;
    }

    @Override // org.telegram.ui.Components.qv0, org.telegram.ui.ActionBar.a6
    public final void e() {
        this.O1.setColor(-15132391);
    }

    @Override // qg.p1
    public final void f() {
        setTextType((this.U0 + 1) % 4);
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new p2.b(5, this, (a2) view)).start();
    }

    @Override // qg.p1
    public final void g(int i10) {
        j jVar = this.S0;
        if (jVar instanceof x2) {
            u0((x2) jVar, i10);
            pg.s0 e = pg.s0.e(this.P1);
            e.g = i10;
            e.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final PointF g0() {
        kv0 paintingSize = getPaintingSize();
        float f7 = paintingSize.a / 2.0f;
        float f10 = paintingSize.b / 2.0f;
        if (this.H0 != null) {
            double radians = (float) Math.toRadians(-(r2.transformRotation + r2.cropRotate));
            float cos = (float) ((Math.cos(radians) * r2.cropPx) - (Math.sin(radians) * r2.cropPy));
            float e = (float) hg.k0.e(radians, r2.cropPy, Math.sin(radians) * r2.cropPx);
            f7 -= cos * paintingSize.a;
            f10 -= e * paintingSize.b;
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

    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.qv0
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
        org.telegram.ui.Components.x5[] x5VarArr;
        i0 i0Var = this.Z0;
        int childCount = i0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = i0Var.getChildAt(i10);
            if (childAt instanceof q2) {
                TLRPC.Document sticker = ((q2) childAt).getSticker();
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
            } else if (childAt instanceof x2) {
                CharSequence text = ((x2) childAt).getText();
                if ((text instanceof Spanned) && (x5VarArr = (org.telegram.ui.Components.x5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.x5.class)) != null) {
                    for (org.telegram.ui.Components.x5 x5Var : x5VarArr) {
                        if (x5Var != null) {
                            TLRPC.Document document = x5Var.document;
                            if (document == null) {
                                document = o5.f(this.P1, x5Var.getDocumentId());
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

    public pg.c1 getRenderView() {
        return this.W0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.S0;
        i0 i0Var = this.Z0;
        if (jVar == null) {
            return getY() + i0Var.getMeasuredHeight();
        }
        jVar.getLocationInWindow(new int[2]);
        return (i0Var.getScaleY() * this.S0.getHeight()) + r2[1];
    }

    public y01 getThanosEffect() {
        if (!y01.c()) {
            return null;
        }
        if (this.a1 == null) {
            y01 y01Var = new y01(getContext(), new n(this, 0));
            this.a1 = y01Var;
            addView(y01Var);
        }
        return this.a1;
    }

    public final a2 h0(String str, boolean z10) {
        float f7;
        kv0 kv0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        i0 i0Var = this.Z0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(i0Var.getMeasuredWidth() * 0.5d);
            kv0Var = new kv0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(i0Var.getMeasuredHeight() * 0.5d);
            kv0Var = new kv0(f7 * floor2, floor2);
        }
        kv0 kv0Var2 = kv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = kv0Var2.a;
            kv0Var2.a = kv0Var2.b;
            kv0Var2.b = f10;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        a2 a2Var = new a2(context, g02, kv0Var2, str, intValue);
        a2Var.setDelegate(this);
        i0Var.addView(a2Var);
        if (z10) {
            p0(a2Var);
            r0(a2Var, true);
        }
        return a2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a0 i0(Object obj, TLRPC.Document document, boolean z10) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f7;
        q6 q6Var;
        double d;
        q6 q6Var2;
        PointF pointF;
        boolean isTextColorEmoji;
        ArrayList arrayList;
        pg.t0 t0Var;
        q6 q6Var3;
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
        q6 q6Var4 = new q6(g0(), f11, f7);
        i0 i0Var = this.Z0;
        if (tL_maskCoords == null || (arrayList = this.n1) == null || arrayList.size() == 0) {
            q6Var = q6Var4;
            d = 0.5d;
        } else {
            int i12 = tL_maskCoords.n;
            long j3 = document.id;
            if (i12 >= 0 && i12 <= 3 && !this.n1.isEmpty()) {
                int size = this.n1.size();
                int nextInt = Utilities.random.nextInt(size);
                int i13 = size;
                loop1: while (i13 > 0) {
                    pg.t0 t0Var2 = (pg.t0) this.n1.get(nextInt);
                    if (t0Var2.a(i12) != null) {
                        d = 0.5d;
                        float f12 = t0Var2.a * 1.1f;
                        int i14 = 0;
                        while (i14 < i0Var.getChildCount()) {
                            View childAt = i0Var.getChildAt(i14);
                            pg.t0 t0Var3 = t0Var2;
                            if (childAt instanceof q2) {
                                q2 q2Var = (q2) childAt;
                                if (q2Var.getAnchor() == i12) {
                                    PointF position = q2Var.getPosition();
                                    q6Var3 = q6Var4;
                                    i10 = size;
                                    f10 = f12;
                                    float hypot = (float) Math.hypot(position.x - r4.x, position.y - r4.y);
                                    if ((j3 == q2Var.getSticker().id || this.n1.size() > 1) && hypot < f10) {
                                        break;
                                    }
                                    i14++;
                                    t0Var2 = t0Var3;
                                    q6Var4 = q6Var3;
                                    size = i10;
                                    f12 = f10;
                                }
                            }
                            q6Var3 = q6Var4;
                            i10 = size;
                            f10 = f12;
                            i14++;
                            t0Var2 = t0Var3;
                            q6Var4 = q6Var3;
                            size = i10;
                            f12 = f10;
                        }
                        q6Var = q6Var4;
                        t0Var = t0Var2;
                        break loop1;
                    }
                    q6Var3 = q6Var4;
                    i10 = size;
                    nextInt = (nextInt + 1) % i10;
                    i13--;
                    q6Var4 = q6Var3;
                    size = i10;
                }
            }
            q6Var = q6Var4;
            d = 0.5d;
            t0Var = null;
            if (t0Var != null) {
                PointF a2 = t0Var.a(i12);
                float f13 = i12 == 1 ? t0Var.e : t0Var.a;
                float f14 = t0Var.b;
                float floor = (float) ((f13 / ((float) Math.floor(getPaintingSize().a * d))) * tL_maskCoords.zoom);
                double radians = (float) Math.toRadians(f14);
                double d10 = 1.5707963267948966d - radians;
                double d11 = f13;
                float sin = (float) (Math.sin(d10) * d11 * tL_maskCoords.x);
                float cos = (float) (Math.cos(d10) * d11 * tL_maskCoords.x);
                double d12 = radians + 1.5707963267948966d;
                q6Var2 = new q6(new PointF(a2.x + sin + ((float) (Math.cos(d12) * d11 * tL_maskCoords.y)), a2.y + cos + ((float) (Math.sin(d12) * d11 * tL_maskCoords.y))), floor, f14);
                Context context = getContext();
                float floor2 = (float) Math.floor(getPaintingSize().a * d);
                kv0 kv0Var = new kv0(floor2, floor2);
                pointF = q6Var2.a;
                a0 a0Var = new a0(this, context, pointF, q6Var2.c, q6Var2.b, kv0Var, document, obj);
                isTextColorEmoji = MessageObject.isTextColorEmoji(document);
                ImageReceiver imageReceiver = a0Var.x0;
                if (isTextColorEmoji) {
                    imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                imageReceiver.setLayerNum(12);
                if (pointF.x == i0Var.getMeasuredWidth() / 2.0f) {
                    a0Var.setStickyX(2);
                }
                if (pointF.y == i0Var.getMeasuredHeight() / 2.0f) {
                    a0Var.setStickyY(2);
                }
                a0Var.setDelegate(this);
                i0Var.addView(a0Var);
                if (z10) {
                    p0(a0Var);
                    r0(a0Var, true);
                }
                return a0Var;
            }
        }
        q6Var2 = q6Var;
        Context context2 = getContext();
        float floor22 = (float) Math.floor(getPaintingSize().a * d);
        kv0 kv0Var2 = new kv0(floor22, floor22);
        pointF = q6Var2.a;
        a0 a0Var2 = new a0(this, context2, pointF, q6Var2.c, q6Var2.b, kv0Var2, document, obj);
        isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver2 = a0Var2.x0;
        if (isTextColorEmoji) {
        }
        imageReceiver2.setLayerNum(12);
        if (pointF.x == i0Var.getMeasuredWidth() / 2.0f) {
        }
        if (pointF.y == i0Var.getMeasuredHeight() / 2.0f) {
        }
        a0Var2.setDelegate(this);
        i0Var.addView(a0Var2);
        if (z10) {
        }
        return a0Var2;
    }

    public final x2 j0(boolean z10) {
        ((cu0) this).o2.g0.isFocusable();
        kv0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        x2 x2Var = new x2(getContext(), A0, (int) (paintingSize.a / 9.0f), "", this.K1, this.U0);
        float f7 = paintingSize.a / 9.0f;
        n nVar = new n(this, 2);
        x2Var.w0 = (int) (0.5f * f7);
        x2Var.x0 = (int) (f7 * 2.0f);
        x2Var.y0 = nVar;
        float f10 = A0.x;
        i0 i0Var = this.Z0;
        if (f10 == i0Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (A0.y == i0Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i10 = this.P1;
        x2Var.setTypeface(pg.s0.e(i10).j);
        x2Var.setType(pg.s0.e(i10).h);
        i0Var.addView(x2Var, w7.x5.c(-2.0f, -2));
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            x2Var.j(1.0f / cropState.cropScale);
            x2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            p0(x2Var);
            x2Var.q();
            r0(x2Var, false);
            x2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(x2Var.getFocusedView());
            this.T0 = true;
            int i11 = pg.s0.e(i10).g;
            r1 r1Var = this.u1;
            r1Var.d(i11, true);
            r1Var.setOutlineType(pg.s0.e(i10).h);
        }
        return x2Var;
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
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) hg.k0.e(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final void l0(boolean z10) {
        int i10 = 0;
        if (this.g2) {
            x0(0);
        }
        if (z10) {
            kz kzVar = this.f2;
            if (kzVar == null || kzVar.getVisibility() != 0) {
                m0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f2.getMeasuredHeight());
            ofFloat.addUpdateListener(new o(this, i10));
            this.i2 = true;
            ofFloat.addListener(new c0(this, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
            ofFloat.start();
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        if (this.S0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        e0 e0Var = this.W0;
        float translationX = ((x10 - e0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / e0Var.getScaleX();
        float y3 = ((((motionEvent.getY() - e0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / e0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-e0Var.getRotation());
        double d10 = y3;
        float measuredWidth = (e0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (e0Var.getMeasuredHeight() / 2.0f) + ((float) hg.k0.e(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        e0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final void m0() {
        kz kzVar;
        j4 j4Var;
        if (this.j2 > 0 && (j4Var = ((cu0) this).o2.K1) != null) {
            j4Var.a();
        }
        if (!this.g2 && (kzVar = this.f2) != null && kzVar.getVisibility() != 8) {
            this.f2.setVisibility(8);
        }
        this.j2 = 0;
    }

    public final void n0(boolean z10) {
        if (this.g1 == 0) {
            this.l1.setLayerType(z10 ? 2 : 0, null);
            this.c1.setLayerType(z10 ? 2 : 0, null);
            this.b1.setLayerType(z10 ? 2 : 0, null);
        }
    }

    public final boolean o0() {
        if (this.L1) {
            w0(false);
            return true;
        }
        if (this.g2) {
            l0(true);
            return true;
        }
        if (!this.T0) {
            return false;
        }
        r0(null, true);
        return true;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (this.f2 != null) {
            int measuredHeight = AndroidUtilities.isTablet() ? i15 - this.f2.getMeasuredHeight() : (R() + i15) - this.f2.getMeasuredHeight();
            kz kzVar = this.f2;
            kzVar.layout(0, measuredHeight, kzVar.getMeasuredWidth(), this.f2.getMeasuredHeight() + measuredHeight);
        }
        int i16 = this.V0 ? 0 : AndroidUtilities.statusBarHeight;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16;
        e0 e0Var = this.W0;
        int ceil = (int) Math.ceil((i14 - e0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.w1.C(8.0f, (((i15 - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - e0Var.getMeasuredHeight()) / 2, i16);
        e0Var.layout(ceil, additionalTop, e0Var.getMeasuredWidth() + ceil, e0Var.getMeasuredHeight() + additionalTop);
        g0 g0Var = this.X0;
        g0Var.layout(ceil, additionalTop, g0Var.getMeasuredWidth() + ceil, g0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = e0Var.getMeasuredWidth();
        i0 i0Var = this.Z0;
        int measuredWidth2 = ((measuredWidth - i0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight2 = ((e0Var.getMeasuredHeight() - i0Var.getMeasuredHeight()) / 2) + additionalTop;
        i0Var.layout(measuredWidth2, measuredHeight2, i0Var.getMeasuredWidth() + measuredWidth2, i0Var.getMeasuredHeight() + measuredHeight2);
        y01 y01Var = this.a1;
        if (y01Var != null) {
            y01Var.layout(measuredWidth2, measuredHeight2, i0Var.getMeasuredWidth() + measuredWidth2, i0Var.getMeasuredHeight() + measuredHeight2);
        }
        j0 j0Var = this.Y0;
        j0Var.layout(ceil, additionalTop, j0Var.getMeasuredWidth() + ceil, j0Var.getMeasuredHeight() + additionalTop);
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
        i0 i0Var = this.Z0;
        i0Var.setScaleX(f12);
        i0Var.setScaleY(this.Q0);
        i0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.R0.b, TLObject.FLAG_30));
        y01 y01Var = this.a1;
        if (y01Var != null) {
            y01Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.R0.b, TLObject.FLAG_30));
            this.a1.setScaleX(this.Q0);
            this.a1.setScaleY(this.Q0);
        }
        C0();
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
            m0();
            this.P0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        kz kzVar = this.f2;
        if (kzVar != null) {
            measureChild(kzVar, i10, i11);
        }
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.F0.b(jVar.getUUID(), new t(this, jVar, 0));
    }

    @Override // qg.h
    public final /* synthetic */ boolean q() {
        return true;
    }

    public final void q0(j jVar) {
        j jVar2 = this.S0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.S0 = null;
            if (jVar instanceof x2) {
                ValueAnimator valueAnimator = this.j1;
                if (valueAnimator != null && this.h1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.Z0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            pg.t1 t1Var = this.F0;
            t1Var.b.remove(uuid);
            t1Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(t1Var, 12));
        }
        z1 z1Var = this.l1;
        k2.c0 c0Var = this.m1;
        z1Var.setValueOverride(c0Var);
        z1Var.setShowPreview(true);
        float f7 = c0Var.get();
        pg.q1 q1Var = this.K1;
        q1Var.c = f7;
        s0(q1Var, null);
    }

    @Override // qg.h
    public final boolean r() {
        return !this.T0;
    }

    public final boolean r0(j jVar, boolean z10) {
        p0 p0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof x2;
        int i11 = 2;
        if (z12 && (((i10 = this.h1) == -1 && this.g1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.j1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.L1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            x2 x2Var = (x2) jVar;
            int gravity = x2Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            r1 r1Var = this.u1;
            r1Var.setAlignment(i11);
            r1Var.setTypeface(x2Var.getTypeface().a);
            r1Var.e(x2Var.getType(), true);
            this.d1.invalidate();
        }
        j jVar2 = this.S0;
        if (jVar2 == null) {
            p0Var = this;
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!this.T0) {
                    int[] k02 = k0(jVar2);
                    y0(new t(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof x2) {
                    AndroidUtilities.showKeyboard(((x2) jVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            p0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = p0Var.S0;
            if (jVar3 instanceof x2) {
                x2 x2Var2 = (x2) jVar3;
                w2 w2Var = x2Var2.q0;
                w2Var.clearFocus();
                w2Var.setEnabled(false);
                w2Var.setClickable(false);
                x2Var2.m();
                if (!z12) {
                    p0Var.T0 = false;
                    AndroidUtilities.hideKeyboard(((x2) p0Var.S0).getFocusedView());
                    l0(false);
                }
            }
            z11 = true;
        }
        j jVar4 = p0Var.S0;
        p0Var.S0 = jVar;
        if ((jVar4 instanceof x2) && TextUtils.isEmpty(((x2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = p0Var.S0;
        k2.c0 c0Var = p0Var.m1;
        pg.q1 q1Var = p0Var.K1;
        z1 z1Var = p0Var.l1;
        if (jVar5 == null) {
            ValueAnimator valueAnimator2 = p0Var.j1;
            if (valueAnimator2 != null && p0Var.h1 != 0) {
                valueAnimator2.cancel();
            }
            if (p0Var.L1) {
                w0(false);
            }
            B0(0);
            z1Var.setValueOverride(c0Var);
            z1Var.setShowPreview(true);
            q1Var.c = c0Var.get();
            s0(q1Var, null);
            return z11;
        }
        j0 j0Var = p0Var.Y0;
        jVar5.m0 = j0Var;
        jVar5.l(j0Var, true);
        p0Var.Z0.bringChildToFront(p0Var.S0);
        j jVar6 = p0Var.S0;
        if (!(jVar6 instanceof x2)) {
            z1Var.setValueOverride(c0Var);
            z1Var.setShowPreview(true);
            q1Var.c = c0Var.get();
            s0(q1Var, null);
            return true;
        }
        x2 x2Var3 = (x2) jVar6;
        x2Var3.z0 = false;
        x2Var3.getSwatch().c = q1Var.c;
        s0(x2Var3.getSwatch(), null);
        z1Var.setValueOverride(new u5(x2Var3, (int) (p0Var.R0.a / 9.0f), 1));
        z1Var.setShowPreview(false);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.P0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(pg.q1 q1Var, Integer num) {
        pg.q1 q1Var2 = this.K1;
        if (q1Var2 != q1Var) {
            q1Var2.a = q1Var.a;
            q1Var2.b = q1Var.b;
            q1Var2.c = q1Var.c;
            int i10 = this.P1;
            pg.s0.e(i10).h(q1Var.a, true);
            pg.s0.e(i10).j(q1Var.c);
        }
        int i11 = q1Var.a;
        e0 e0Var = this.W0;
        e0Var.setColor(i11);
        e0Var.setBrushSize(q1Var.c);
        int i12 = q1Var2.a;
        if (num == null || num.intValue() == i12) {
            m0 m0Var = this.c1;
            if (m0Var != null) {
                m0Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new ci.x4(this, num, i12, 2));
            duration.start();
        }
        j jVar = this.S0;
        if (jVar instanceof x2) {
            ((x2) jVar).setSwatch(new pg.q1(q1Var.b, q1Var.c, q1Var.a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(ch.d dVar) {
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

    @Override // qg.p1
    public final void t() {
        j4 j4Var;
        if (!this.h2 && !this.g2) {
            j0(true);
            return;
        }
        boolean z10 = this.g2;
        if (z10 && (j4Var = ((cu0) this).o2.K1) != null) {
            j4Var.e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.S0;
            if (jVar instanceof x2) {
                AndroidUtilities.showKeyboard(((x2) jVar).getEditText());
            }
        }
    }

    public final void t0(float f7) {
        this.C0 = f7;
        this.b1.setTranslationY(-f7);
        this.c1.setTranslationY(f7);
    }

    @Override // qg.h
    public final void u(float f7, float f10, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) hg.k0.e(radians, d10, Math.sin(radians) * d));
    }

    @Override // qg.t1
    public final pg.s0 v() {
        return pg.s0.e(this.P1);
    }

    public final void v0(float f7, float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        float f17;
        this.I0 = f7;
        this.N0 = f12;
        this.O0 = f13;
        this.J0 = f10;
        this.K0 = f11;
        this.L0 = f10;
        float f18 = f11 + 0.0f;
        this.M0 = f18;
        int i10 = 0;
        while (i10 < 4) {
            View view = i10 == 0 ? this.Z0 : i10 == 1 ? this.Y0 : i10 == 2 ? this.W0 : this.X0;
            MediaController.CropState cropState = this.H0;
            if (cropState != null) {
                float f19 = cropState.cropScale * 1.0f;
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
                f14 = f19 * max;
                float C = com.google.android.gms.internal.vision.e2.C(cropState.cropPx, measuredWidth, f7, max);
                float f20 = cropState.cropScale;
                f15 = (C * f20) + f10;
                f16 = (cropState.cropPy * measuredHeight * f7 * max * f20) + f18;
                f17 = cropState.cropRotate + i11;
            } else {
                f14 = i10 == 0 ? this.Q0 * 1.0f : 1.0f;
                f15 = f10;
                f16 = f18;
                f17 = 0.0f;
            }
            float f21 = ((-this.j2) / 2.0f) + f16;
            float f22 = f7 * f14;
            if (Float.isNaN(f22)) {
                f22 = 1.0f;
            }
            view.setScaleX(f22);
            view.setScaleY(f22);
            view.setTranslationX(f15);
            view.setTranslationY(f21);
            view.setRotation(f17);
            view.invalidate();
            i10++;
        }
        C0();
        invalidate();
    }

    public final void w0(final boolean z10) {
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
            this.M1.b(new o1.g() { // from class: qg.u
                @Override // o1.g
                public final void a(o1.h hVar, float f7, float f10) {
                    p0 p0Var = p0.this;
                    m0 m0Var = p0Var.c1;
                    float f11 = f7 / 1000.0f;
                    p0Var.N1 = f11;
                    float f12 = ((1.0f - f11) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f12);
                    view.setScaleY(f12);
                    view.setTranslationY((Math.min(p0Var.N1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(p0Var.N1, 0.25f) / 0.25f));
                    l0 l0Var = p0Var.G1;
                    float f13 = p0Var.N1;
                    boolean z11 = z10;
                    l0Var.z1(f13, z11);
                    p0Var.B0.setProgress(p0Var.N1);
                    p0Var.A0.setProgress(p0Var.N1);
                    p0Var.f1.setTranslationY(AndroidUtilities.dp(32.0f) * p0Var.N1);
                    if (zArr[0]) {
                        float f14 = p0Var.N1;
                        if (!z11) {
                            f14 = 1.0f - f14;
                        }
                        m0Var.setTranslationY(translationY - ((AndroidUtilities.dp(40.0f) * f14) * (z11 ? 1 : -1)));
                    }
                    m0Var.invalidate();
                    if (view == p0Var.u1) {
                        p0Var.d1.invalidate();
                    }
                }
            });
            this.M1.a(new r(this, z10, i10));
            this.M1.f();
            if (z10) {
                l0 l0Var = this.G1;
                l0Var.setVisibility(0);
                l0Var.setSelectedColorIndex(pg.s0.e(this.P1).d());
            }
        }
    }

    public final void x0(int i10) {
        r1 r1Var = this.u1;
        int i11 = 0;
        int i12 = 1;
        if (i10 != 1) {
            zg emojiButton = r1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(xg.e, true);
            }
            kz kzVar = this.f2;
            if (kzVar != null) {
                this.g2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.j2 = 0;
            }
            j4 j4Var = ((cu0) this).o2.K1;
            if (j4Var != null) {
                j4Var.a();
            }
            requestLayout();
            getHeight();
            return;
        }
        kz kzVar2 = this.f2;
        boolean z10 = kzVar2 != null && kzVar2.getVisibility() == 0;
        kz kzVar3 = this.f2;
        if (kzVar3 != null && kzVar3.c1 != UserConfig.selectedAccount) {
            removeView(kzVar3);
            this.f2 = null;
        }
        if (this.f2 == null) {
            kz kzVar4 = new kz(null, true, false, false, getContext(), false, null, null, true, this.Q1, false, false);
            this.f2 = kzVar4;
            kzVar4.U0 = true;
            kzVar4.setVisibility(8);
            if (AndroidUtilities.isTablet()) {
                this.f2.setForseMultiwindowLayout(true);
            }
            this.f2.setDelegate(new d0(this));
            addView(this.f2);
        }
        this.f2.setVisibility(0);
        this.g2 = true;
        kz kzVar5 = this.f2;
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar5.getLayoutParams();
        layoutParams.height = i13;
        kzVar5.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            j jVar = this.S0;
            if (jVar instanceof x2) {
                AndroidUtilities.hideKeyboard(((x2) jVar).getEditText());
            }
        }
        this.j2 = i13;
        requestLayout();
        j4 j4Var2 = ((cu0) this).o2.K1;
        if (j4Var2 != null) {
            j4Var2.a();
        }
        zg emojiButton2 = r1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(xg.d, true);
        }
        getHeight();
        if (z10 || this.h2) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j2, 0.0f);
        ofFloat.addUpdateListener(new o(this, i12));
        ofFloat.addListener(new c0(this, i11));
        ofFloat.start();
    }

    @Override // qg.t1
    public final void y() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final void y0(Runnable runnable, p0 p0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.o1 o1Var = this.R1;
        if (o1Var != null && o1Var.isShowing()) {
            this.R1.d(true);
            return;
        }
        if (this.S1 == null) {
            this.T1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.Q1);
            this.S1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.S1.setBackgroundColor(-14145495);
            this.S1.setOnTouchListener(new h5(this, 1));
            this.S1.setDispatchKeyEventListener(new q(this));
            this.S1.setShownFromBottom(true);
        }
        this.S1.d();
        runnable.run();
        if (this.R1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.S1, -2, -2);
            this.R1 = o1Var2;
            o1Var2.b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.R1.setOutsideTouchable(true);
            this.R1.setClippingEnabled(true);
            this.R1.setInputMethodMode(2);
            this.R1.setSoftInputMode(0);
            this.R1.getContentView().setFocusableInTouchMode(true);
            this.R1.setOnDismissListener(new j5(this, 1));
        }
        this.S1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.R1.setFocusable(true);
        this.R1.showAtLocation(p0Var, i10, i11 - (this.S1.getMeasuredWidth() / 2), i12 - this.S1.getMeasuredHeight());
        org.telegram.ui.ActionBar.o1.i(this.S1);
    }

    @Override // qg.h
    public final void z(j jVar) {
        int[] k02 = k0(jVar);
        y0(new t(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    public final void z0(boolean z10) {
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
                w1 w1Var = this.v1;
                w1Var.setAlpha(0.0f);
                w1Var.setVisibility(0);
            }
            this.F1.b(new qa(3, this));
            this.F1.a(new r(this, z10, 0));
            this.F1.f();
        }
    }

    @Override // qg.h
    public final /* synthetic */ void A(boolean z10) {
    }

    @Override // qg.h
    public final /* synthetic */ void B() {
    }

    public View getView() {
        return this;
    }

    @Override // qg.h
    public final /* synthetic */ void h(boolean z10) {
    }

    @Override // qg.h
    public final /* synthetic */ void i(boolean z10) {
    }

    @Override // qg.h
    public final /* synthetic */ void k() {
    }

    @Override // qg.h
    public final /* synthetic */ void l() {
    }

    @Override // qg.h
    public final /* synthetic */ void n(boolean z10) {
    }

    @Override // qg.h
    public final /* synthetic */ void w() {
    }
}
