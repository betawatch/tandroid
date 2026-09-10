package zh;

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
import bi.df;
import bi.r9;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import org.telegram.ui.h01;
import org.telegram.ui.hz;
import org.telegram.ui.iz;
import org.telegram.ui.ju0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class y6 extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public w6 a;
    public w6 b;
    public bi.x4 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.f6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF v;
    public final Paint w;
    public final org.telegram.ui.Components.d6 x;
    public final org.telegram.ui.Components.d6 y;

    public y6(Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = new Matrix();
        this.f = new float[2];
        this.s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.n = f6Var;
        this.x = new org.telegram.ui.Components.d6(view, 0L, 120L, new LinearInterpolator());
        this.y = new org.telegram.ui.Components.d6(view, 0L, 360L, wr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(r9 r9Var) {
        if (r9Var == null || r9Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < r9Var.T0.size(); i10++) {
            if (((VideoEditedInfo.MediaEntity) r9Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((VideoEditedInfo.MediaEntity) r9Var.T0.get(i10)).mediaArea);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, iz izVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        bi.x4 x4Var = this.c;
        if (x4Var != null) {
            x4Var.e(true);
            this.c = null;
        }
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            frameLayout = this.d;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt != frameLayout) {
                removeView(childAt);
                i10--;
            }
            i10++;
        }
        this.b = null;
        this.y.d(0.0f, true);
        invalidate();
        b(false);
        this.r = arrayList;
        if (arrayList == null) {
            return;
        }
        this.G = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    b7 b7Var = new b7(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, izVar);
                    if (storyItem != null) {
                        b7Var.c(storyItem.views, false);
                    }
                    w7.c6.a(b7Var);
                    view = b7Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    df dfVar = new df();
                    dfVar.c = tL_mediaAreaWeather.emoji;
                    dfVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    pg.s0 s0Var = new pg.s0(getContext(), AndroidUtilities.density);
                    s0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                    s0Var.setIsVideo(true);
                    s0Var.d(UserConfig.selectedAccount, dfVar.c);
                    s0Var.setText(dfVar.a());
                    s0Var.e(3, tL_mediaAreaWeather.color);
                    view = new x6(getContext(), s0Var, mediaArea);
                } else {
                    view = new w6(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, iz izVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, izVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Canvas canvas2;
        RectF rectF;
        float f7;
        float f10;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            w6 w6Var = this.b;
            float e = this.x.e((w6Var == null || !w6Var.s || w6Var.w) ? false : true);
            w6 w6Var2 = this.b;
            boolean z10 = w6Var2 != null && w6Var2.w;
            float e7 = this.y.e(z10);
            RectF rectF2 = this.v;
            if (e > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f7 = 0.0f;
                f10 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.d6 d6Var = ((w6) childAt).a;
                        w6 w6Var3 = this.b;
                        float e10 = d6Var.e(childAt == w6Var3 && w6Var3.s);
                        if (e10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (e10 * 255.0f);
                            Paint paint = this.w;
                            paint.setAlpha(i11);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
                f7 = 0.0f;
                f10 = 0.2f;
            }
            if ((z10 || e7 > f7) && this.a != null) {
                if (this.F == null) {
                    this.F = ((f2) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e7, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    w6 w6Var4 = this.a;
                    float lerp = AndroidUtilities.lerp(1.0f, (w6Var4.x ? w6Var4.r.a(0.05f) : 1.0f) * 1.05f, e7);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * f10;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f7, f7, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.a.getX(), this.a.getY());
                    canvas2.rotate(this.a.getRotation(), this.a.getPivotX(), this.a.getPivotY());
                    canvas2.scale(this.a.getScaleX() * lerp, this.a.getScaleY() * lerp, this.a.getPivotX(), this.a.getPivotY());
                    this.a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.F;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.F = null;
                }
            }
            invalidate();
        } else if (view instanceof w6) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((w6) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (this.G) {
            return;
        }
        this.G = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w6) {
                w6 w6Var = (w6) childAt;
                k5 k5Var = w6Var.H;
                if (w6Var.v) {
                    AndroidUtilities.cancelRunOnUIThread(k5Var);
                    AndroidUtilities.runOnUIThread(k5Var, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0408  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        w6 w6Var;
        float f7;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        boolean z12;
        if (view instanceof w6) {
            if (view instanceof b7) {
                b7 b7Var = (b7) view;
                TL_stories.MediaArea mediaArea = b7Var.b;
                a3 a3Var = ((f2) this).I;
                boolean z13 = a3Var.C1;
                z2 z2Var = a3Var.O1;
                if (!z13 && z2Var.a != null) {
                    yg.p0 d = yg.p0.d(mediaArea.reaction);
                    if (!d.equals(yg.p0.d(z2Var.a.sent_reaction))) {
                        a3Var.L0(d);
                    }
                }
                b7Var.performHapticFeedback(3);
                b7Var.K.a.startAnimation();
                iz izVar = a3Var.k1;
                Random random = izVar.h;
                FrameLayout frameLayout = izVar.G;
                ArrayList arrayList2 = izVar.F;
                if (arrayList2.size() > 12) {
                    return;
                }
                yg.p0 d10 = yg.p0.d(mediaArea.reaction);
                String str = d10.f;
                if (str == null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.p5.f(izVar.b, d10.g));
                }
                float measuredHeight = b7Var.getMeasuredHeight();
                float measuredWidth = b7Var.getMeasuredWidth();
                View view2 = (View) b7Var.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f10 = 0.4f * view2.getWidth();
                    f7 = f10;
                } else {
                    f7 = measuredHeight;
                    f10 = measuredWidth;
                }
                String q6 = iz.q(str);
                int hashCode = b7Var.hashCode();
                boolean z14 = b7Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d10.f != null) {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                    if (izVar.d(q6, hashCode, null, null, -1, false, false, f10, f7, z14)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        hz hzVar = (hz) hc.b.i(1, arrayList);
                        hzVar.getClass();
                        hzVar.e = f12;
                        hzVar.d = f11;
                        hzVar.a = b7Var.getTranslationX() - (hzVar.d / 2.0f);
                        float translationY = b7Var.getTranslationY();
                        float f13 = hzVar.d;
                        hzVar.b = translationY - (1.5f * f13);
                        if (hzVar.m) {
                            hzVar.a = ((-f13) * 1.8f) + hzVar.a;
                            return;
                        } else {
                            hzVar.a = ((-f13) * 0.2f) + hzVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                }
                if (d10.g == 0 || b7Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    int i12 = i10;
                    if (((hz) arrayList.get(i10)).k == d10.g) {
                        i11++;
                    }
                    i10 = i12 + 1;
                }
                if (i11 >= 4) {
                    return;
                }
                hz hzVar2 = new hz();
                hzVar2.j = yg.e.a(b7Var.getAnimatedEmojiDrawable(), true, true);
                if (!hzVar2.i) {
                    hzVar2.f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                    hzVar2.g = ((random.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                }
                hzVar2.p = hashCode;
                hzVar2.q = null;
                hzVar2.k = d10.g;
                hzVar2.m = z12;
                hzVar2.e = f12;
                hzVar2.d = f11;
                hzVar2.a = b7Var.getTranslationX() - (hzVar2.d / 2.0f);
                float translationY2 = b7Var.getTranslationY();
                float f14 = hzVar2.d;
                hzVar2.b = translationY2 - (1.5f * f14);
                hzVar2.a = ((-f14) * 1.8f) + hzVar2.a;
                if (izVar.n) {
                    hzVar2.j.f(frameLayout);
                }
                arrayList.add(hzVar2);
                return;
            }
            if (this.b == view) {
                AndroidUtilities.runOnUIThread(new k5(this, 6), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((f2) this).H.H(new eo(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    nf.f.s(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    nf.f.s(getContext(), "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                h01 h01Var = new h01(3, 1);
                h01Var.E = true;
                h01Var.M0 = this.b.b;
                h01Var.setResourceProvider(this.n);
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
                    h01Var.N0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                h01Var.O0 = false;
                h01Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                ((f2) this).H.H(h01Var);
                this.b = null;
                invalidate();
                return;
            }
            w6 w6Var2 = (w6) view;
            this.a = w6Var2;
            this.b = w6Var2;
            invalidate();
            bi.x4 x4Var = this.c;
            if (x4Var != null) {
                x4Var.e(true);
                this.c = null;
            }
            bi.x4 x4Var2 = new bi.x4(getContext(), 0);
            Paint paint = new Paint(1);
            x4Var2.b0 = paint;
            paint.setPathEffect(new CornerPathEffect(x4Var2.v));
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new bi.w4(x4Var2, 0));
            x4Var2.a0 = zVar;
            zVar.setCallback(x4Var2);
            x4Var2.m(0.0f, this.b.getTranslationX() - AndroidUtilities.dp(8.0f));
            x4Var2.d = 5000L;
            this.c = x4Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    x4Var2.p(true);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.l1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ju0(1), length, spannableStringBuilder.length(), 33);
                    x4Var2.k(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    uq uqVar = new uq(R.drawable.photos_arrow, 0);
                    uqVar.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
                    spannableString.setSpan(uqVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    uq uqVar2 = new uq(R.drawable.attach_arrow_right, 0);
                    uqVar2.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
                    uqVar2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(uqVar2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    x4Var2.s(spannableStringBuilder);
                    x4Var2.l0 = new l6(1, this, x4Var2);
                    float f15 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) AndroidUtilities.dp(f15)) < ((float) AndroidUtilities.dp(100.0f));
                    x4Var2.a = !z11 ? 1 : 3;
                    w6Var = this.b;
                    if (!(w6Var.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (w6Var.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f15) >= AndroidUtilities.dp(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + w6Var.getTranslationY() <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                        x4Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        x4Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f15));
                    } else {
                        x4Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    x4Var2.setOnClickListener(new org.telegram.ui.web.c(this, 27));
                    x4Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.d.addView(x4Var2, w7.a6.c(f15, -1));
                    x4Var2.u();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            uq uqVar3 = new uq(R.drawable.photos_arrow, 0);
            uqVar3.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
            spannableString3.setSpan(uqVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            uq uqVar22 = new uq(R.drawable.attach_arrow_right, 0);
            uqVar22.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
            uqVar22.setScale(-1.0f, 1.0f);
            spannableString22.setSpan(uqVar22, 0, spannableString22.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString3);
            x4Var2.s(spannableStringBuilder);
            x4Var2.l0 = new l6(1, this, x4Var2);
            float f152 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) AndroidUtilities.dp(f152)) < ((float) AndroidUtilities.dp(100.0f))) {
            }
            x4Var2.a = !z11 ? 1 : 3;
            w6Var = this.b;
            if (!(w6Var.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            x4Var2.setOnClickListener(new org.telegram.ui.web.c(this, 27));
            x4Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.d.addView(x4Var2, w7.a6.c(f152, -1));
            x4Var2.u();
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.F;
        if (bitmap != null) {
            bitmap.recycle();
            this.F = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.layout(0, 0, i12 - i10, i13 - i11);
            } else if (childAt instanceof w6) {
                w6 w6Var = (w6) childAt;
                TL_stories.MediaArea mediaArea = w6Var.b;
                int measuredWidth = w6Var.getMeasuredWidth();
                int measuredHeight = w6Var.getMeasuredHeight();
                w6Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                w6Var.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                w6Var.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                w6Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof x6) {
                x6 x6Var = (x6) childAt;
                TL_stories.MediaArea mediaArea2 = x6Var.a;
                int measuredWidth2 = x6Var.getMeasuredWidth();
                int measuredHeight2 = x6Var.getMeasuredHeight();
                x6Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                x6Var.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                x6Var.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                x6Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof w6) {
                w6 w6Var = (w6) getChildAt(i12);
                w6Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((w6Var.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((w6Var.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof x6) {
                x6 x6Var = (x6) getChildAt(i12);
                x6Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((x6Var.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((x6Var.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        bi.x4 x4Var;
        if (getChildCount() == 0 || (x4Var = this.c) == null || !x4Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            bi.x4 x4Var2 = this.c;
            if (x4Var2 != null) {
                x4Var2.e(true);
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
