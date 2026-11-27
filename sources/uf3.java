// default package

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uf3 extends jf0 {
    public StaticLayout E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public TLRPC.RecentMeUrl f;
    public ImageReceiver h;
    public rb0 n;
    public int r;
    public StaticLayout s;
    public int w;
    public int x;
    public int y;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.H) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), aob.t0);
        } else {
            canvas2 = canvas;
        }
        if (this.s != null) {
            canvas2.save();
            canvas2.translate(this.r, hl.L(13.0f));
            this.s.draw(canvas2);
            canvas2.restore();
        }
        if (this.E != null) {
            canvas2.save();
            canvas2.translate(this.y, this.x);
            try {
                this.E.draw(canvas2);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            canvas2.restore();
        }
        if (this.F) {
            jf0.u(this.w, hl.L(16.5f), aob.e1);
            jf0.u(this.w, hl.L(16.5f), aob.i1);
            aob.e1.draw(canvas2);
            aob.i1.draw(canvas2);
        }
        this.h.h(canvas2, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:3|(3:5|(1:7)(1:119)|8)(2:120|(4:122|(1:124)(1:134)|(3:126|(2:128|(1:130)(1:131))|132)|133)(28:135|(3:137|(1:139)(1:141)|140)(2:142|(6:144|(1:146)(1:155)|147|(1:149)(1:154)|150|(1:152)(1:153))(2:156|(3:158|(1:160)(1:162)|161)(1:163)))|10|(1:12)|13|(1:15)(1:118)|16|17|(2:19|(1:21))|22|23|24|25|26|27|28|29|30|31|(3:33|(1:35)(1:103)|36)(3:104|(1:106)(1:108)|107)|37|38|39|40|41|42|43|(4:45|(4:49|(1:51)|52|(2:54|(1:56)))|57|(1:69)(2:63|(2:65|66)(1:68)))(3:(4:75|(2:77|(1:79))|80|(1:82))|83|(1:94)(2:89|(2:91|92)(1:93)))))|9|10|(0)|13|(0)(0)|16|17|(0)|22|23|24|25|26|27|28|29|30|31|(0)(0)|37|38|39|40|41|42|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02da, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02db, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x024d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0255, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0250, code lost:
    
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0252, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0253, code lost:
    
        r7 = r13;
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02d8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02dd, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0359  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        int measuredWidth;
        int L;
        int measuredWidth2;
        boolean z2;
        if (!z) {
            return;
        }
        int i5 = this.I;
        ImageReceiver imageReceiver = this.h;
        rb0 rb0Var = this.n;
        TextPaint textPaint = aob.A0[0];
        TextPaint textPaint2 = aob.E0[0];
        this.F = false;
        TLRPC.RecentMeUrl recentMeUrl = this.f;
        if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChat) {
            TLRPC.Chat M0 = uc7.s1(i5).M0(Long.valueOf(this.f.chat_id));
            this.F = M0.verified;
            if (ob6.a0) {
                getMeasuredWidth();
                hl.L(hl.C);
                this.r = hl.L(14.0f);
            } else {
                this.r = hl.L(hl.C + 4);
            }
            str2 = M0.title;
            rb0Var.p(M0);
            imageReceiver.U(M0, rb0Var, this.f);
        } else {
            if (!(recentMeUrl instanceof TLRPC.TL_recentMeUrlUser)) {
                if (recentMeUrl instanceof TLRPC.TL_recentMeUrlStickerSet) {
                    if (ob6.a0) {
                        this.r = hl.L(14.0f);
                    } else {
                        this.r = hl.L(hl.C);
                    }
                    String str3 = this.f.set.set.title;
                    rb0Var.j(5L, str3, null, null);
                    str = null;
                    imageReceiver.d0(jn5.b(this.f.set.cover), null, rb0Var, null, this.f, 0);
                    str2 = str3;
                } else {
                    str = null;
                    if (recentMeUrl instanceof TLRPC.TL_recentMeUrlChatInvite) {
                        if (ob6.a0) {
                            this.r = hl.L(14.0f);
                        } else {
                            this.r = hl.L(hl.C);
                        }
                        TLRPC.ChatInvite chatInvite = this.f.chat_invite;
                        TLRPC.Chat chat = chatInvite.chat;
                        if (chat != null) {
                            rb0Var.p(chat);
                            TLRPC.RecentMeUrl recentMeUrl2 = this.f;
                            TLRPC.Chat chat2 = recentMeUrl2.chat_invite.chat;
                            str2 = chat2.title;
                            this.F = chat2.verified;
                            imageReceiver.U(chat2, rb0Var, recentMeUrl2);
                        } else {
                            String str4 = chatInvite.title;
                            rb0Var.j(5L, str4, null, null);
                            imageReceiver.d0(jn5.i(xb4.w(this.f.chat_invite.photo.sizes, 50, false, null, false), this.f.chat_invite.photo), "50_50", rb0Var, null, this.f, 0);
                            str2 = str4;
                        }
                        if (ob6.a0) {
                            getMeasuredWidth();
                            hl.L(hl.C);
                            this.r = hl.L(14.0f);
                        } else {
                            this.r = hl.L(hl.C + 4);
                        }
                    } else if (recentMeUrl instanceof TLRPC.TL_recentMeUrlUnknown) {
                        if (ob6.a0) {
                            this.r = hl.L(14.0f);
                        } else {
                            this.r = hl.L(hl.C);
                        }
                        imageReceiver.d0(null, null, rb0Var, null, this.f, 0);
                        str2 = "Url";
                    } else {
                        imageReceiver.d0(null, null, rb0Var, null, recentMeUrl, 0);
                        str2 = "";
                    }
                }
                String str5 = uc7.s1(i5).N2 + "/" + this.f.url;
                if (TextUtils.isEmpty(str2)) {
                    str2 = ob6.M0(2131749082, str);
                }
                if (ob6.a0) {
                    measuredWidth = getMeasuredWidth() - this.r;
                    L = hl.L(14.0f);
                } else {
                    measuredWidth = getMeasuredWidth() - this.r;
                    L = hl.L(hl.C);
                }
                int i6 = measuredWidth - L;
                if (this.F) {
                    int intrinsicWidth = aob.e1.getIntrinsicWidth() + hl.L(6.0f);
                    i6 -= intrinsicWidth;
                    if (ob6.a0) {
                        this.r += intrinsicWidth;
                    }
                }
                int max = Math.max(hl.L(12.0f), i6);
                CharSequence ellipsize = TextUtils.ellipsize(str2.replace('\n', ' '), textPaint, max - hl.L(12.0f), TextUtils.TruncateAt.END);
                TextPaint textPaint3 = textPaint2;
                int i7 = max;
                this.s = new StaticLayout(ellipsize, textPaint, max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                int measuredWidth3 = getMeasuredWidth();
                byte b = hl.C;
                int L2 = measuredWidth3 - hl.L(b + 16);
                if (ob6.a0) {
                    this.y = hl.L(16.0f);
                    measuredWidth2 = getMeasuredWidth() - hl.L(hl.O1() ? 65.0f : 61.0f);
                } else {
                    this.y = hl.L(b);
                    measuredWidth2 = hl.L(hl.O1() ? 13.0f : 9.0f);
                }
                imageReceiver.i0(measuredWidth2, this.G, hl.L(52.0f), hl.L(52.0f));
                int max2 = Math.max(hl.L(12.0f), L2);
                int i8 = max2;
                this.E = new StaticLayout(TextUtils.ellipsize(str5, textPaint3, max2 - hl.L(12.0f), TextUtils.TruncateAt.END), textPaint3, max2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                z2 = ob6.a0;
                StaticLayout staticLayout = this.s;
                if (z2) {
                    if (staticLayout != null && staticLayout.getLineCount() > 0) {
                        float lineRight = this.s.getLineRight(0);
                        if (lineRight == i7) {
                            double ceil = Math.ceil(this.s.getLineWidth(0));
                            double d = i7;
                            if (ceil < d) {
                                this.r = (int) (this.r - (d - ceil));
                            }
                        }
                        if (this.F) {
                            this.w = (int) (this.r + lineRight + hl.L(6.0f));
                        }
                    }
                    StaticLayout staticLayout2 = this.E;
                    if (staticLayout2 == null || staticLayout2.getLineCount() <= 0 || this.E.getLineRight(0) != i8) {
                        return;
                    }
                    double ceil2 = Math.ceil(this.E.getLineWidth(0));
                    double d2 = i8;
                    if (ceil2 < d2) {
                        this.y = (int) (this.y - (d2 - ceil2));
                        return;
                    }
                    return;
                }
                if (staticLayout != null && staticLayout.getLineCount() > 0) {
                    float lineLeft = this.s.getLineLeft(0);
                    double ceil3 = Math.ceil(this.s.getLineWidth(0));
                    if (this.F) {
                        this.w = (int) ((((i7 - ceil3) + this.r) - hl.L(6.0f)) - aob.e1.getIntrinsicWidth());
                    }
                    if (lineLeft == 0.0f) {
                        double d3 = i7;
                        if (ceil3 < d3) {
                            this.r = (int) ((d3 - ceil3) + this.r);
                        }
                    }
                }
                StaticLayout staticLayout3 = this.E;
                if (staticLayout3 == null || staticLayout3.getLineCount() <= 0 || this.E.getLineLeft(0) != 0.0f) {
                    return;
                }
                double ceil4 = Math.ceil(this.E.getLineWidth(0));
                double d4 = i8;
                if (ceil4 < d4) {
                    this.y = (int) ((d4 - ceil4) + this.y);
                    return;
                }
                return;
            }
            TLRPC.User X1 = uc7.s1(i5).X1(Long.valueOf(this.f.user_id));
            if (ob6.a0) {
                this.r = hl.L(14.0f);
            } else {
                this.r = hl.L(hl.C);
            }
            if (X1 != null) {
                if (X1.bot) {
                    if (ob6.a0) {
                        getMeasuredWidth();
                        hl.L(hl.C);
                        this.r = hl.L(14.0f);
                    } else {
                        this.r = hl.L(hl.C + 4);
                    }
                }
                this.F = X1.verified;
            }
            str2 = lbc.r(X1);
            rb0Var.q(X1);
            imageReceiver.U(X1, rb0Var, this.f);
        }
        str = null;
        String str52 = uc7.s1(i5).N2 + "/" + this.f.url;
        if (TextUtils.isEmpty(str2)) {
        }
        if (ob6.a0) {
        }
        int i62 = measuredWidth - L;
        if (this.F) {
        }
        int max3 = Math.max(hl.L(12.0f), i62);
        CharSequence ellipsize2 = TextUtils.ellipsize(str2.replace('\n', ' '), textPaint, max3 - hl.L(12.0f), TextUtils.TruncateAt.END);
        TextPaint textPaint32 = textPaint2;
        int i72 = max3;
        this.s = new StaticLayout(ellipsize2, textPaint, max3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int measuredWidth32 = getMeasuredWidth();
        byte b2 = hl.C;
        int L22 = measuredWidth32 - hl.L(b2 + 16);
        if (ob6.a0) {
        }
        imageReceiver.i0(measuredWidth2, this.G, hl.L(52.0f), hl.L(52.0f));
        int max22 = Math.max(hl.L(12.0f), L22);
        int i82 = max22;
        this.E = new StaticLayout(TextUtils.ellipsize(str52, textPaint32, max22 - hl.L(12.0f), TextUtils.TruncateAt.END), textPaint32, max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        z2 = ob6.a0;
        StaticLayout staticLayout4 = this.s;
        if (z2) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(72.0f));
    }

    public void setDialogSelected(boolean z) {
        if (this.H != z) {
            invalidate();
        }
        this.H = z;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f = recentMeUrl;
        requestLayout();
    }
}
