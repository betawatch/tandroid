// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y5b extends View implements vlb {
    public static Object J;
    public static Vector K;
    public float E;
    public int F;
    public CharSequence G;
    public int H;
    public ValueAnimator I;
    public final r63 a;
    public final TextPaint b;
    public final PorterDuffColorFilter c;
    public StaticLayout d;
    public float e;
    public cn f;
    public final qa6 h;
    public final Path n;
    public final ArrayList r;
    public final ArrayList s;
    public boolean w;
    public boolean x;
    public final Object y;

    public y5b(Context context, int i, TLObject tLObject, Object obj, boolean z, ArrayList arrayList, r63 r63Var) {
        super(context);
        Vector vector;
        this.H = -12;
        this.a = r63Var;
        setMinimumWidth(gm.L(196.0f));
        setPadding(gm.L(13.0f), gm.L(8.0f), gm.L(13.0f), gm.L(8.0f));
        int i2 = cmb.h6;
        fg0 Y = cmb.Y(cmb.v0(i2, r63Var), 0, 8);
        wmb M = anb.M(i2);
        setBackground(Y);
        anb.j(this, Y, null, M, r63Var);
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(gm.L(13.0f));
        int i3 = cmb.D8;
        textPaint.setColor(cmb.v0(i3, r63Var));
        this.c = new PorterDuffColorFilter(cmb.v0(i3, r63Var), PorterDuff.Mode.SRC_IN);
        qa6 qa6Var = new qa6(r63Var);
        this.h = qa6Var;
        qa6Var.setCallback(this);
        qa6Var.f(cmb.p1(0.2f, -1), cmb.p1(0.05f, -1));
        Path path = new Path();
        this.n = path;
        qa6Var.y = path;
        qa6Var.j(4.0f);
        boolean[] zArr = {true};
        this.y = obj;
        if (!z) {
            this.w = true;
            this.x = false;
            ArrayList arrayList2 = new ArrayList();
            this.s = arrayList2;
            arrayList2.addAll(arrayList);
            if (this.s.size() == 1) {
                hs6.d0(i).m0((TLRPC.InputStickerSet) this.s.get(0), 0, false, false, new x5b(this, (byte) 0));
                return;
            } else {
                set(this.s.size());
                a(false);
                return;
            }
        }
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = false;
        this.x = false;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        ev0 ev0Var = new ev0(this, obj, arrayList, zArr, i);
        if (J != obj || (vector = K) == null) {
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getAttachedStickers, new af(obj, i, (Object) tL_messages_getAttachedStickers, (Object) ev0Var, (byte) 10));
        } else {
            zArr[0] = false;
            ev0Var.run(vector, null);
        }
    }

    private void set(TLRPC.StickerSetCovered stickerSetCovered) {
        CharSequence charSequence;
        SpannableString spannableString = new SpannableString("x " + stickerSetCovered.set.title);
        spannableString.setSpan(new do4(cmb.Wc, this.h.a), 0, spannableString.length(), 33);
        spannableString.setSpan(new z5c(gm.o()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new gn(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        setText(gm.G2(this.w ? this.x ? jb6.M0(2131744381, null) : jb6.M0(2131744386, null) : jb6.M0(2131744378, null), charSequence, "%s"));
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            this.E = 1.0f;
            invalidate();
            post(new nsa(this, (byte) 19));
        } else {
            this.I = ValueAnimator.ofFloat(this.E, 1.0f);
            this.I.addUpdateListener(new d30((byte) 9, this, this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > gm.L(3.0f)));
            this.I.setInterpolator(d53.h);
            this.I.setStartDelay(150L);
            this.I.setDuration(400L);
            this.I.start();
        }
    }

    public final /* synthetic */ void b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        set(tL_messages_stickerSet);
        a(false);
    }

    public final void c(TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            J = obj;
            K = vector;
            int i2 = 0;
            while (true) {
                int size = vector.objects.size();
                arrayList2 = this.s;
                arrayList3 = this.r;
                if (i2 >= size) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i2);
                arrayList3.add(stickerSetCovered);
                TLRPC.StickerSet stickerSet = stickerSetCovered.set;
                if (stickerSet != null) {
                    arrayList2.add(hs6.b0(stickerSet));
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    if (stickerSet2.emojis) {
                        this.w = true;
                    } else if (!stickerSet2.masks) {
                        this.x = true;
                    }
                }
                i2++;
            }
            int size2 = (arrayList != null ? arrayList.size() : 0) + (arrayList3 == null ? 0 : arrayList3.size());
            if (arrayList2 != null && arrayList != null && !arrayList.isEmpty()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i3);
                    long j = inputStickerSet.id;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            arrayList2.add(inputStickerSet);
                            break;
                        } else if (((TLRPC.InputStickerSet) arrayList2.get(i4)).id != j) {
                            i4++;
                        }
                    }
                }
                this.w = true;
            }
            if (size2 != 1) {
                set(size2);
            } else if (arrayList3.size() >= 1) {
                set((TLRPC.StickerSetCovered) arrayList3.get(0));
            } else {
                if (arrayList != null && arrayList.size() >= 1) {
                    zArr[0] = false;
                    hs6.d0(i).m0((TLRPC.InputStickerSet) arrayList.get(0), 0, false, false, new x5b(this, (byte) 1));
                    return;
                }
                set(0);
            }
            a(zArr[0]);
        }
    }

    public final /* synthetic */ void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        set(tL_messages_stickerSet);
        a(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f = this.E;
        if (f < 1.0f) {
            qa6 qa6Var = this.h;
            qa6Var.setAlpha((int) ((1.0f - f) * 255.0f));
            Path path = this.n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            float L = gm.L(12.0f) + getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, L, direction);
            path.addRect(getPaddingLeft(), gm.L(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), gm.L(28.0f) + getPaddingTop(), direction);
            qa6Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            if (this.E > 0.0f) {
                canvas.save();
                canvas.translate(getPaddingLeft() - (jb6.a0 ? 0.0f : this.e), getPaddingTop());
                this.b.setAlpha((int) (this.E * 255.0f));
                this.d.draw(canvas);
                gn.drawAnimatedEmojis(canvas, this.d, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.E, this.c);
                canvas.restore();
            }
        }
    }

    public az3 getAlert() {
        ArrayList arrayList = this.s;
        if (arrayList != null) {
            return new az3(null, getContext(), this.a, arrayList);
        }
        int i = -this.H;
        this.H = i;
        gm.A3(i, this, null);
        xx0.E.a();
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = View.MeasureSpec.getMode(i) == 1073741824;
        int paddingTop = getPaddingTop();
        int L = gm.L(29.0f);
        StaticLayout staticLayout = this.d;
        setMeasuredDimension(z ? View.MeasureSpec.getSize(i) : getMinimumWidth(), getPaddingBottom() + gm.U1(this.E, L, staticLayout == null ? gm.L(29.0f) : staticLayout.getHeight()) + paddingTop);
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        if (z) {
            CharSequence charSequence = this.G;
            if (charSequence == null && (this.d == null || this.F == size)) {
                return;
            }
            if (charSequence == null) {
                charSequence = this.d.getText();
            }
            setText(charSequence);
            this.G = null;
            this.F = size;
        }
    }

    public void setText(CharSequence charSequence) {
        if (getMeasuredWidth() <= 0) {
            this.G = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.G = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        this.e = staticLayout.getLineCount() > 0 ? this.d.getLineLeft(0) : 0.0f;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f = gn.update(0, this, this.f, this.d);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            TextPaint textPaint = this.b;
            if (textPaint != null) {
                textPaint.setColor(cmb.v0(cmb.D8, this.a));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.h || super.verifyDrawable(drawable);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        String M0;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new do4(cmb.Wc, this.h.a), 0, spannableString.length(), 33);
        spannableString.setSpan(new z5c(gm.o()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                document = null;
                break;
            } else {
                if (arrayList.get(i).id == tL_messages_stickerSet.set.thumb_document_id) {
                    document = arrayList.get(i);
                    break;
                }
                i++;
            }
        }
        if (document == null && !arrayList.isEmpty()) {
            document = arrayList.get(0);
        }
        if (document != null) {
            spannableString.setSpan(new gn(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        if (!this.w) {
            M0 = jb6.M0(2131744378, null);
        } else if (this.x) {
            M0 = jb6.M0(2131744381, null);
        } else {
            M0 = jb6.M0(2131744386, null);
        }
        setText(gm.G2(M0, charSequence, "%s"));
    }

    private void set(int i) {
        boolean z = this.w;
        qa6 qa6Var = this.h;
        if (!z) {
            setText(gm.N2(jb6.G(i, "StoryContainsStickers", new Object[0]), 0, cmb.v0(cmb.Wc, qa6Var.a), null, null));
        } else if (this.x) {
            setText(gm.N2(jb6.G(i, "StoryContainsStickersEmoji", new Object[0]), 0, cmb.v0(cmb.Wc, qa6Var.a), null, null));
        } else {
            setText(gm.N2(jb6.G(i, "StoryContainsEmoji", new Object[0]), 0, cmb.v0(cmb.Wc, qa6Var.a), null, null));
        }
    }
}
