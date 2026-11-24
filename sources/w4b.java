// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class w4b extends FrameLayout implements View.OnClickListener {
    public final lm E;
    public final Path F;
    public Bitmap G;
    public boolean H;
    public u4b a;
    public u4b b;
    public je5 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final d28 h;
    public final f53 n;
    public ArrayList r;
    public final Rect s;
    public final RectF w;
    public final Paint x;
    public final lm y;

    public w4b(Context context, d28 d28Var, f53 f53Var) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = new Matrix();
        this.f = new float[2];
        this.s = new Rect();
        this.w = new RectF();
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.F = new Path();
        this.H = false;
        this.h = d28Var;
        this.n = f53Var;
        this.y = new lm(d28Var, 0L, 120L, new LinearInterpolator());
        this.E = new lm(d28Var, 0L, 360L, s33.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(f4b f4bVar) {
        if (f4bVar == null || f4bVar.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f4bVar.T0.size(); i++) {
            if (((mac) f4bVar.T0.get(i)).N instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((mac) f4bVar.T0.get(i)).N);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z);

    public final void c(TL_stories.StoryItem storyItem, zu3 zu3Var) {
        d(storyItem, storyItem != null ? storyItem.media_areas : null, zu3Var);
    }

    public final void d(TL_stories.StoryItem storyItem, ArrayList arrayList, zu3 zu3Var) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        je5 je5Var = this.c;
        if (je5Var != null) {
            je5Var.f(true);
            this.c = null;
        }
        int i = 0;
        while (true) {
            int childCount = getChildCount();
            frameLayout = this.d;
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            if (childAt != frameLayout) {
                removeView(childAt);
                i--;
            }
            i++;
        }
        this.b = null;
        this.E.e(true, 0.0f);
        invalidate();
        b(false);
        this.r = arrayList;
        if (arrayList == null) {
            return;
        }
        this.H = false;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i2);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    c6b c6bVar = new c6b(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, zu3Var);
                    if (storyItem != null) {
                        c6bVar.c(storyItem.views, false);
                    }
                    ote.a(c6bVar);
                    view = c6bVar;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    fsc fscVar = new fsc();
                    fscVar.c = tL_mediaAreaWeather.emoji;
                    fscVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    hb6 hb6Var = new hb6(getContext(), gl.p);
                    hb6Var.setMaxWidth(gl.q.x);
                    hb6Var.setIsVideo(true);
                    hb6Var.d(y6c.t0, fscVar.c);
                    hb6Var.setText(fscVar.a());
                    hb6Var.e(3, tL_mediaAreaWeather.color);
                    view = new v4b(getContext(), hb6Var, mediaArea);
                } else {
                    view = new u4b(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2;
        RectF rectF;
        float f;
        if (view == this.d) {
            u4b u4bVar = this.b;
            float d = this.y.d((u4bVar == null || !u4bVar.s || u4bVar.x) ? false : true);
            u4b u4bVar2 = this.b;
            boolean z = u4bVar2 != null && u4bVar2.x;
            float d2 = this.E.d(z);
            RectF rectF2 = this.w;
            if (d > 0.0f) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), kk7.d4, 31);
                canvas2.drawColor(bkb.p1(d, 402653184));
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof u4b) {
                        lm lmVar = ((u4b) childAt).a;
                        u4b u4bVar3 = this.b;
                        float d3 = lmVar.d(childAt == u4bVar3 && u4bVar3.s);
                        if (d3 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i2 = (int) (d3 * 255.0f);
                            Paint paint = this.x;
                            paint.setAlpha(i2);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                f = 0.2f;
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
                f = 0.2f;
            }
            if ((z || d2 > 0.0f) && this.a != null) {
                Bitmap bitmap = this.G;
                if (bitmap == null) {
                    bitmap = ((b28) this).J.getPlayingBitmap();
                    this.G = bitmap;
                }
                if (bitmap != null) {
                    canvas2.drawColor(bkb.p1(d2, 805306368));
                    canvas2.save();
                    Path path = this.F;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    u4b u4bVar4 = this.a;
                    float R1 = gl.R1(1.0f, (u4bVar4.y ? u4bVar4.r.a(0.05f) : 1.0f) * 1.05f, d2);
                    canvas2.scale(R1, R1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * f;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = gl.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.G.getWidth();
                    int height = this.G.getHeight();
                    Rect rect = this.s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.G, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.a.getX(), this.a.getY());
                    canvas2.rotate(this.a.getRotation(), this.a.getPivotX(), this.a.getPivotY());
                    canvas2.scale(this.a.getScaleX() * R1, this.a.getScaleY() * R1, this.a.getPivotX(), this.a.getPivotY());
                    this.a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap2 = this.G;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.G = null;
                }
            }
            invalidate();
        } else if (view instanceof u4b) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((u4b) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e() {
        if (this.H) {
            return;
        }
        this.H = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof u4b) {
                u4b u4bVar = (u4b) childAt;
                kya kyaVar = u4bVar.I;
                if (u4bVar.w) {
                    gl.r(kyaVar);
                    gl.e3(kyaVar, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0408  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        u4b u4bVar;
        float f;
        float f2;
        ArrayList arrayList;
        int i;
        float f3;
        float f4;
        boolean z3;
        if (view instanceof u4b) {
            byte b = 12;
            float f5 = 2.0f;
            if (view instanceof c6b) {
                c6b c6bVar = (c6b) view;
                TL_stories.MediaArea mediaArea = c6bVar.b;
                y28 y28Var = ((b28) this).J;
                boolean z4 = y28Var.s1;
                x28 x28Var = y28Var.E1;
                if (!z4 && x28Var.a != null) {
                    h19 d = h19.d(mediaArea.reaction);
                    if (!d.equals(h19.d(x28Var.a.sent_reaction))) {
                        y28Var.E0(d);
                    }
                }
                c6bVar.performHapticFeedback(3);
                c6bVar.L.a.w0(false);
                zu3 zu3Var = y28Var.a1;
                Random random = zu3Var.h;
                FrameLayout frameLayout = zu3Var.H;
                ArrayList arrayList2 = zu3Var.G;
                if (arrayList2.size() <= 12) {
                    h19 d2 = h19.d(mediaArea.reaction);
                    String str = d2.f;
                    if (str == null) {
                        str = k27.U(vl.e(zu3Var.b, d2.g));
                    }
                    float measuredHeight = c6bVar.getMeasuredHeight();
                    float measuredWidth = c6bVar.getMeasuredWidth();
                    View view2 = (View) c6bVar.getParent();
                    if (measuredWidth > view2.getWidth() * 0.5f) {
                        f2 = 0.4f * view2.getWidth();
                        f = f2;
                    } else {
                        f = measuredHeight;
                        f2 = measuredWidth;
                    }
                    String p = zu3.p(str);
                    int hashCode = c6bVar.hashCode();
                    boolean z5 = c6bVar.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                    if (d2.f != null) {
                        arrayList = arrayList2;
                        boolean d3 = zu3Var.d(p, hashCode, null, null, -1, false, false, f2, f, z5);
                        i = hashCode;
                        f3 = f2;
                        f4 = f;
                        z3 = z5;
                        if (d3) {
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            yu3 yu3Var = (yu3) b00.f(1, arrayList);
                            yu3Var.getClass();
                            yu3Var.e = f4;
                            yu3Var.d = f3;
                            yu3Var.a = c6bVar.getTranslationX() - (yu3Var.d / 2.0f);
                            float translationY = c6bVar.getTranslationY();
                            float f6 = yu3Var.d;
                            yu3Var.b = translationY - (1.5f * f6);
                            boolean z6 = yu3Var.m;
                            float f7 = yu3Var.a;
                            if (z6) {
                                yu3Var.a = ((-f6) * 1.8f) + f7;
                                return;
                            } else {
                                yu3Var.a = ((-f6) * 0.2f) + f7;
                                return;
                            }
                        }
                    } else {
                        arrayList = arrayList2;
                        i = hashCode;
                        f3 = f2;
                        f4 = f;
                        z3 = z5;
                    }
                    if (d2.g == 0 || c6bVar.getAnimatedEmojiDrawable() == null) {
                        return;
                    }
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        float f8 = f5;
                        ArrayList arrayList3 = arrayList;
                        if (((yu3) arrayList.get(i3)).k == d2.g) {
                            i2++;
                        }
                        i3++;
                        arrayList = arrayList3;
                        f5 = f8;
                    }
                    ArrayList arrayList4 = arrayList;
                    float f9 = f5;
                    if (i2 < 4) {
                        yu3 yu3Var2 = new yu3();
                        yu3Var2.j = xl.a(c6bVar.getAnimatedEmojiDrawable(), true, true);
                        if (!yu3Var2.i) {
                            yu3Var2.f = ((random.nextInt() % 101) / 100.0f) * (f3 / 4.0f);
                            yu3Var2.g = ((random.nextInt() % 101) / 100.0f) * (f4 / 4.0f);
                        }
                        yu3Var2.p = i;
                        yu3Var2.q = null;
                        yu3Var2.k = d2.g;
                        yu3Var2.m = z3;
                        yu3Var2.e = f4;
                        yu3Var2.d = f3;
                        yu3Var2.a = c6bVar.getTranslationX() - (yu3Var2.d / f9);
                        float translationY2 = c6bVar.getTranslationY();
                        float f10 = yu3Var2.d;
                        yu3Var2.b = translationY2 - (1.5f * f10);
                        yu3Var2.a = ((-f10) * 1.8f) + yu3Var2.a;
                        if (zu3Var.n) {
                            yu3Var2.j.f(frameLayout);
                        }
                        arrayList4.add(yu3Var2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.b == view) {
                gl.e3(new kya(this, b), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((b28) this).I.L(new mu1(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    d01.t(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    d01.t(getContext(), "https://" + na7.q1(y6c.t0).N2 + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                nn8 nn8Var = new nn8(r6, (byte) 1);
                nn8Var.w = true;
                nn8Var.T0 = this.b.b;
                nn8Var.setResourceProvider(this.n);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                TL_stories.MediaArea mediaArea3 = this.b.b;
                if (mediaArea3 instanceof TL_stories.TL_mediaAreaVenue) {
                    TL_stories.TL_mediaAreaVenue tL_mediaAreaVenue = (TL_stories.TL_mediaAreaVenue) mediaArea3;
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                    tL_messageMediaVenue.venue_id = tL_mediaAreaVenue.venue_id;
                    tL_messageMediaVenue.venue_type = tL_mediaAreaVenue.venue_type;
                    tL_messageMediaVenue.title = tL_mediaAreaVenue.title;
                    tL_messageMediaVenue.address = tL_mediaAreaVenue.address;
                    tL_messageMediaVenue.provider = tL_mediaAreaVenue.provider;
                    tL_messageMediaVenue.geo = tL_mediaAreaVenue.geo;
                    tL_message.media = tL_messageMediaVenue;
                } else if (!(mediaArea3 instanceof TL_stories.TL_mediaAreaGeoPoint)) {
                    this.b = null;
                    invalidate();
                    return;
                } else {
                    nn8Var.U0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                nn8Var.V0 = false;
                nn8Var.F0(new k27(y6c.t0, tL_message, false, false));
                ((b28) this).I.L(nn8Var);
                this.b = null;
                invalidate();
                return;
            }
            u4b u4bVar2 = (u4b) view;
            this.a = u4bVar2;
            this.b = u4bVar2;
            invalidate();
            je5 je5Var = this.c;
            if (je5Var != null) {
                je5Var.f(true);
                this.c = null;
            }
            je5 je5Var2 = new je5(getContext(), 0);
            Paint paint = new Paint(1);
            je5Var2.c0 = paint;
            paint.setPathEffect(new CornerPathEffect(je5Var2.w));
            ff0 ff0Var = new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new f6(je5Var2, (byte) 4));
            je5Var2.b0 = ff0Var;
            ff0Var.setCallback(je5Var2);
            je5Var2.o(0.0f, this.b.getTranslationX() - gl.L(8.0f));
            je5Var2.d = 5000L;
            this.c = je5Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) k96.M0(2131744207, null));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) k96.M0(2131744209, null));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    je5Var2.p(true);
                    spannableStringBuilder.append((CharSequence) k96.M0(2131744353, null));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), gl.q.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(bkb.p1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new z88((byte) 1), length, spannableStringBuilder.length(), 33);
                    je5Var2.m(11.0f, 7.0f, 11.0f, 7.0f);
                    z = true;
                    SpannableString spannableString = new SpannableString(">");
                    cm2 cm2Var = new cm2(R.drawable.photos_arrow, 0);
                    float L = gl.L(!z ? 1.0f : 2.0f);
                    float L2 = gl.L(!z ? 0.0f : 1.0f);
                    cm2Var.r = L;
                    cm2Var.s = L2;
                    spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    cm2 cm2Var2 = new cm2(R.drawable.attach_arrow_right, 0);
                    float L3 = gl.L(!z ? -1.0f : -2.0f);
                    float L4 = gl.L(z ? 0.0f : 1.0f);
                    cm2Var2.r = L3;
                    cm2Var2.s = L4;
                    cm2Var2.I = -1.0f;
                    cm2Var2.J = 1.0f;
                    spannableString2.setSpan(cm2Var2, 0, spannableString2.length(), 33);
                    if (gl.J1(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    gl.H2(spannableStringBuilder, spannableString, ">");
                    je5Var2.t(spannableStringBuilder);
                    je5Var2.r0 = new iya(this, je5Var2, (byte) 27);
                    float f11 = !z ? 100 : 50;
                    z2 = this.b.getTranslationY() - ((float) gl.L(f11)) < ((float) gl.L(100.0f));
                    je5Var2.a = z2 ? (byte) 1 : (byte) 3;
                    u4bVar = this.b;
                    if ((u4bVar.b instanceof TL_stories.TL_mediaAreaChannelPost) || (!z2 ? (u4bVar.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - gl.L(f11) < gl.L(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + u4bVar.getTranslationY() > getMeasuredHeight() - gl.L(120.0f))) {
                        u4b u4bVar3 = this.b;
                        if (z2) {
                            je5Var2.setTranslationY((u4bVar3.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - gl.L(f11));
                        } else {
                            je5Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + u4bVar3.getTranslationY());
                        }
                    } else {
                        je5Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    }
                    je5Var2.setOnClickListener(new bna(this, (byte) 13));
                    je5Var2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
                    this.d.addView(je5Var2, nme.c(f11, -1));
                    je5Var2.v();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) k96.M0(2131744208, null));
            }
            z = false;
            SpannableString spannableString3 = new SpannableString(">");
            cm2 cm2Var3 = new cm2(R.drawable.photos_arrow, 0);
            float L5 = gl.L(!z ? 1.0f : 2.0f);
            float L22 = gl.L(!z ? 0.0f : 1.0f);
            cm2Var3.r = L5;
            cm2Var3.s = L22;
            spannableString3.setSpan(cm2Var3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            cm2 cm2Var22 = new cm2(R.drawable.attach_arrow_right, 0);
            float L32 = gl.L(!z ? -1.0f : -2.0f);
            float L42 = gl.L(z ? 0.0f : 1.0f);
            cm2Var22.r = L32;
            cm2Var22.s = L42;
            cm2Var22.I = -1.0f;
            cm2Var22.J = 1.0f;
            spannableString22.setSpan(cm2Var22, 0, spannableString22.length(), 33);
            if (gl.J1(spannableStringBuilder)) {
            }
            gl.H2(spannableStringBuilder, spannableString3, ">");
            je5Var2.t(spannableStringBuilder);
            je5Var2.r0 = new iya(this, je5Var2, (byte) 27);
            float f112 = !z ? 100 : 50;
            if (this.b.getTranslationY() - ((float) gl.L(f112)) < ((float) gl.L(100.0f))) {
            }
            je5Var2.a = z2 ? (byte) 1 : (byte) 3;
            u4bVar = this.b;
            if (u4bVar.b instanceof TL_stories.TL_mediaAreaChannelPost) {
            }
            u4b u4bVar32 = this.b;
            if (z2) {
            }
            je5Var2.setOnClickListener(new bna(this, (byte) 13));
            je5Var2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
            this.d.addView(je5Var2, nme.c(f112, -1));
            je5Var2.v();
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            bitmap.recycle();
            this.G = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt == this.d) {
                childAt.layout(0, 0, i3 - i, i4 - i2);
            } else if (childAt instanceof u4b) {
                u4b u4bVar = (u4b) childAt;
                TL_stories.MediaArea mediaArea = u4bVar.b;
                int measuredWidth = u4bVar.getMeasuredWidth();
                int measuredHeight = u4bVar.getMeasuredHeight();
                u4bVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                u4bVar.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                u4bVar.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                u4bVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof v4b) {
                v4b v4bVar = (v4b) childAt;
                TL_stories.MediaArea mediaArea2 = v4bVar.a;
                int measuredWidth2 = v4bVar.getMeasuredWidth();
                int measuredHeight2 = v4bVar.getMeasuredHeight();
                v4bVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                v4bVar.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                v4bVar.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                v4bVar.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof u4b) {
                u4b u4bVar = (u4b) getChildAt(i3);
                u4bVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((u4bVar.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((u4bVar.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof v4b) {
                v4b v4bVar = (v4b) getChildAt(i3);
                v4bVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((v4bVar.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((v4bVar.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        je5 je5Var;
        if (getChildCount() == 0 || (je5Var = this.c) == null || !je5Var.W) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            je5 je5Var2 = this.c;
            if (je5Var2 != null) {
                je5Var2.f(true);
                this.c = null;
            }
            this.b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
