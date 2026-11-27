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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class v8b extends FrameLayout implements View.OnClickListener {
    public final mm E;
    public final Path F;
    public Bitmap G;
    public boolean H;
    public t8b a;
    public t8b b;
    public kg5 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final u58 h;
    public final x53 n;
    public ArrayList r;
    public final Rect s;
    public final RectF w;
    public final Paint x;
    public final mm y;

    public v8b(Context context, u58 u58Var, x53 x53Var) {
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
        this.h = u58Var;
        this.n = x53Var;
        this.y = new mm(u58Var, 0L, 120L, new LinearInterpolator());
        this.E = new mm(u58Var, 0L, 360L, k43.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(c8b c8bVar) {
        if (c8bVar == null || c8bVar.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c8bVar.T0.size(); i++) {
            if (((mec) c8bVar.T0.get(i)).N instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((mec) c8bVar.T0.get(i)).N);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z);

    public final void c(TL_stories.StoryItem storyItem, tv3 tv3Var) {
        d(storyItem, storyItem != null ? storyItem.media_areas : null, tv3Var);
    }

    public final void d(TL_stories.StoryItem storyItem, ArrayList arrayList, tv3 tv3Var) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        kg5 kg5Var = this.c;
        if (kg5Var != null) {
            kg5Var.f(true);
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
                    aab aabVar = new aab(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, tv3Var);
                    if (storyItem != null) {
                        aabVar.c(storyItem.views, false);
                    }
                    iye.a(aabVar);
                    view = aabVar;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    vwc vwcVar = new vwc();
                    vwcVar.c = tL_mediaAreaWeather.emoji;
                    vwcVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    ld6 ld6Var = new ld6(getContext(), hl.p);
                    ld6Var.setMaxWidth(hl.q.x);
                    ld6Var.setIsVideo(true);
                    ld6Var.d(yac.t0, vwcVar.c);
                    ld6Var.setText(vwcVar.a());
                    ld6Var.e(3, tL_mediaAreaWeather.color);
                    view = new u8b(getContext(), ld6Var, mediaArea);
                } else {
                    view = new t8b(getContext(), this.h, mediaArea);
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
            t8b t8bVar = this.b;
            float d = this.y.d((t8bVar == null || !t8bVar.s || t8bVar.x) ? false : true);
            t8b t8bVar2 = this.b;
            boolean z = t8bVar2 != null && t8bVar2.x;
            float d2 = this.E.d(z);
            RectF rectF2 = this.w;
            if (d > 0.0f) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), jn7.d4, 31);
                canvas2.drawColor(aob.p1(d, 402653184));
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof t8b) {
                        mm mmVar = ((t8b) childAt).a;
                        t8b t8bVar3 = this.b;
                        float d3 = mmVar.d(childAt == t8bVar3 && t8bVar3.s);
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
                    bitmap = ((s58) this).J.getPlayingBitmap();
                    this.G = bitmap;
                }
                if (bitmap != null) {
                    canvas2.drawColor(aob.p1(d2, 805306368));
                    canvas2.save();
                    Path path = this.F;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    t8b t8bVar4 = this.a;
                    float R1 = hl.R1(1.0f, (t8bVar4.y ? t8bVar4.r.a(0.05f) : 1.0f) * 1.05f, d2);
                    canvas2.scale(R1, R1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * f;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = hl.P;
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
        } else if (view instanceof t8b) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((t8b) view).a(canvas);
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
            if (childAt instanceof t8b) {
                t8b t8bVar = (t8b) childAt;
                s8b s8bVar = t8bVar.I;
                if (t8bVar.w) {
                    hl.r(s8bVar);
                    hl.d3(s8bVar, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0406  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        t8b t8bVar;
        float f;
        float f2;
        ArrayList arrayList;
        float f3;
        float f4;
        boolean z3;
        if (view instanceof t8b) {
            float f5 = 2.0f;
            if (view instanceof aab) {
                aab aabVar = (aab) view;
                TL_stories.MediaArea mediaArea = aabVar.b;
                o68 o68Var = ((s58) this).J;
                boolean z4 = o68Var.m1;
                n68 n68Var = o68Var.y1;
                if (!z4 && n68Var.a != null) {
                    w49 d = w49.d(mediaArea.reaction);
                    if (!d.equals(w49.d(n68Var.a.sent_reaction))) {
                        o68Var.E0(d);
                    }
                }
                aabVar.performHapticFeedback(3);
                aabVar.L.a.w0(false);
                tv3 tv3Var = o68Var.U0;
                Random random = tv3Var.h;
                FrameLayout frameLayout = tv3Var.H;
                ArrayList arrayList2 = tv3Var.G;
                if (arrayList2.size() <= 12) {
                    w49 d2 = w49.d(mediaArea.reaction);
                    String str = d2.f;
                    if (str == null) {
                        str = r47.U(wl.e(tv3Var.b, d2.g));
                    }
                    float measuredHeight = aabVar.getMeasuredHeight();
                    float measuredWidth = aabVar.getMeasuredWidth();
                    View view2 = (View) aabVar.getParent();
                    if (measuredWidth > view2.getWidth() * 0.5f) {
                        f2 = 0.4f * view2.getWidth();
                        f = f2;
                    } else {
                        f = measuredHeight;
                        f2 = measuredWidth;
                    }
                    String p = tv3.p(str);
                    int hashCode = aabVar.hashCode();
                    boolean z5 = aabVar.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                    if (d2.f != null) {
                        arrayList = arrayList2;
                        f3 = f2;
                        f4 = f;
                        z3 = z5;
                        if (tv3Var.d(p, hashCode, null, null, -1, false, false, f2, f, z5)) {
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            sv3 sv3Var = (sv3) c00.g(1, arrayList);
                            sv3Var.getClass();
                            sv3Var.e = f4;
                            sv3Var.d = f3;
                            sv3Var.a = aabVar.getTranslationX() - (sv3Var.d / 2.0f);
                            float translationY = aabVar.getTranslationY();
                            float f6 = sv3Var.d;
                            sv3Var.b = translationY - (1.5f * f6);
                            boolean z6 = sv3Var.m;
                            float f7 = sv3Var.a;
                            if (z6) {
                                sv3Var.a = ((-f6) * 1.8f) + f7;
                                return;
                            } else {
                                sv3Var.a = ((-f6) * 0.2f) + f7;
                                return;
                            }
                        }
                    } else {
                        arrayList = arrayList2;
                        f3 = f2;
                        f4 = f;
                        z3 = z5;
                    }
                    if (d2.g == 0 || aabVar.getAnimatedEmojiDrawable() == null) {
                        return;
                    }
                    int i = 0;
                    int i2 = 0;
                    while (i < arrayList.size()) {
                        float f8 = f5;
                        ArrayList arrayList3 = arrayList;
                        if (((sv3) arrayList.get(i)).k == d2.g) {
                            i2++;
                        }
                        i++;
                        arrayList = arrayList3;
                        f5 = f8;
                    }
                    ArrayList arrayList4 = arrayList;
                    float f9 = f5;
                    if (i2 < 4) {
                        sv3 sv3Var2 = new sv3();
                        sv3Var2.j = yl.a(aabVar.getAnimatedEmojiDrawable(), true, true);
                        if (!sv3Var2.i) {
                            sv3Var2.f = ((random.nextInt() % 101) / 100.0f) * (f3 / 4.0f);
                            sv3Var2.g = ((random.nextInt() % 101) / 100.0f) * (f4 / 4.0f);
                        }
                        sv3Var2.p = hashCode;
                        sv3Var2.q = null;
                        sv3Var2.k = d2.g;
                        sv3Var2.m = z3;
                        sv3Var2.e = f4;
                        sv3Var2.d = f3;
                        sv3Var2.a = aabVar.getTranslationX() - (sv3Var2.d / f9);
                        float translationY2 = aabVar.getTranslationY();
                        float f10 = sv3Var2.d;
                        sv3Var2.b = translationY2 - (1.5f * f10);
                        sv3Var2.a = ((-f10) * 1.8f) + sv3Var2.a;
                        if (tv3Var.n) {
                            sv3Var2.j.f(frameLayout);
                        }
                        arrayList4.add(sv3Var2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.b == view) {
                hl.d3(new uoa((Object) this, (byte) 29), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((s58) this).I.L(new zu1(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    m01.u(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    m01.u(getContext(), "https://" + uc7.s1(yac.t0).N2 + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                yq8 yq8Var = new yq8(r5, (byte) 1);
                yq8Var.w = true;
                yq8Var.T0 = this.b.b;
                yq8Var.setResourceProvider(this.n);
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
                    yq8Var.U0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                yq8Var.V0 = false;
                yq8Var.G0(new r47(yac.t0, tL_message, false, false));
                ((s58) this).I.L(yq8Var);
                this.b = null;
                invalidate();
                return;
            }
            t8b t8bVar2 = (t8b) view;
            this.a = t8bVar2;
            this.b = t8bVar2;
            invalidate();
            kg5 kg5Var = this.c;
            if (kg5Var != null) {
                kg5Var.f(true);
                this.c = null;
            }
            kg5 kg5Var2 = new kg5(getContext(), 0);
            Paint paint = new Paint(1);
            kg5Var2.c0 = paint;
            paint.setPathEffect(new CornerPathEffect(kg5Var2.w));
            hf0 hf0Var = new hf0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new g6(kg5Var2, (byte) 4));
            kg5Var2.b0 = hf0Var;
            hf0Var.setCallback(kg5Var2);
            kg5Var2.o(0.0f, this.b.getTranslationX() - hl.L(8.0f));
            kg5Var2.d = 5000L;
            this.c = kg5Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) ob6.M0(2131744101, null));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) ob6.M0(2131744103, null));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    kg5Var2.p(true);
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131744247, null));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), hl.q.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(aob.p1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new qc8((byte) 1), length, spannableStringBuilder.length(), 33);
                    kg5Var2.m(11.0f, 7.0f, 11.0f, 7.0f);
                    z = true;
                    SpannableString spannableString = new SpannableString(">");
                    wm2 wm2Var = new wm2(R.drawable.photos_arrow, 0);
                    float L = hl.L(!z ? 1.0f : 2.0f);
                    float L2 = hl.L(!z ? 0.0f : 1.0f);
                    wm2Var.r = L;
                    wm2Var.s = L2;
                    spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    wm2 wm2Var2 = new wm2(R.drawable.attach_arrow_right, 0);
                    float L3 = hl.L(!z ? -1.0f : -2.0f);
                    float L4 = hl.L(z ? 0.0f : 1.0f);
                    wm2Var2.r = L3;
                    wm2Var2.s = L4;
                    wm2Var2.I = -1.0f;
                    wm2Var2.J = 1.0f;
                    spannableString2.setSpan(wm2Var2, 0, spannableString2.length(), 33);
                    if (hl.J1(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    hl.G2(spannableStringBuilder, spannableString, ">");
                    kg5Var2.t(spannableStringBuilder);
                    kg5Var2.r0 = new n3b(this, kg5Var2, (byte) 25);
                    float f11 = !z ? 100 : 50;
                    z2 = this.b.getTranslationY() - ((float) hl.L(f11)) < ((float) hl.L(100.0f));
                    kg5Var2.a = z2 ? (byte) 1 : (byte) 3;
                    t8bVar = this.b;
                    if ((t8bVar.b instanceof TL_stories.TL_mediaAreaChannelPost) || (!z2 ? (t8bVar.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - hl.L(f11) < hl.L(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + t8bVar.getTranslationY() > getMeasuredHeight() - hl.L(120.0f))) {
                        t8b t8bVar3 = this.b;
                        if (z2) {
                            kg5Var2.setTranslationY((t8bVar3.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - hl.L(f11));
                        } else {
                            kg5Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + t8bVar3.getTranslationY());
                        }
                    } else {
                        kg5Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    }
                    kg5Var2.setOnClickListener(new kla(this, (byte) 14));
                    kg5Var2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
                    this.d.addView(kg5Var2, tre.c(f11, -1));
                    kg5Var2.v();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) ob6.M0(2131744102, null));
            }
            z = false;
            SpannableString spannableString3 = new SpannableString(">");
            wm2 wm2Var3 = new wm2(R.drawable.photos_arrow, 0);
            float L5 = hl.L(!z ? 1.0f : 2.0f);
            float L22 = hl.L(!z ? 0.0f : 1.0f);
            wm2Var3.r = L5;
            wm2Var3.s = L22;
            spannableString3.setSpan(wm2Var3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            wm2 wm2Var22 = new wm2(R.drawable.attach_arrow_right, 0);
            float L32 = hl.L(!z ? -1.0f : -2.0f);
            float L42 = hl.L(z ? 0.0f : 1.0f);
            wm2Var22.r = L32;
            wm2Var22.s = L42;
            wm2Var22.I = -1.0f;
            wm2Var22.J = 1.0f;
            spannableString22.setSpan(wm2Var22, 0, spannableString22.length(), 33);
            if (hl.J1(spannableStringBuilder)) {
            }
            hl.G2(spannableStringBuilder, spannableString3, ">");
            kg5Var2.t(spannableStringBuilder);
            kg5Var2.r0 = new n3b(this, kg5Var2, (byte) 25);
            float f112 = !z ? 100 : 50;
            if (this.b.getTranslationY() - ((float) hl.L(f112)) < ((float) hl.L(100.0f))) {
            }
            kg5Var2.a = z2 ? (byte) 1 : (byte) 3;
            t8bVar = this.b;
            if (t8bVar.b instanceof TL_stories.TL_mediaAreaChannelPost) {
            }
            t8b t8bVar32 = this.b;
            if (z2) {
            }
            kg5Var2.setOnClickListener(new kla(this, (byte) 14));
            kg5Var2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
            this.d.addView(kg5Var2, tre.c(f112, -1));
            kg5Var2.v();
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
            } else if (childAt instanceof t8b) {
                t8b t8bVar = (t8b) childAt;
                TL_stories.MediaArea mediaArea = t8bVar.b;
                int measuredWidth = t8bVar.getMeasuredWidth();
                int measuredHeight = t8bVar.getMeasuredHeight();
                t8bVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                t8bVar.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                t8bVar.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                t8bVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof u8b) {
                u8b u8bVar = (u8b) childAt;
                TL_stories.MediaArea mediaArea2 = u8bVar.a;
                int measuredWidth2 = u8bVar.getMeasuredWidth();
                int measuredHeight2 = u8bVar.getMeasuredHeight();
                u8bVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                u8bVar.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                u8bVar.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                u8bVar.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof t8b) {
                t8b t8bVar = (t8b) getChildAt(i3);
                t8bVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((t8bVar.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((t8bVar.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof u8b) {
                u8b u8bVar = (u8b) getChildAt(i3);
                u8bVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((u8bVar.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((u8bVar.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kg5 kg5Var;
        if (getChildCount() == 0 || (kg5Var = this.c) == null || !kg5Var.W) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            kg5 kg5Var2 = this.c;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
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
