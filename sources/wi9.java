// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class wi9 extends FrameLayout implements tjb, eib {
    public ti9 E;
    public boolean F;
    public boolean G;
    public od9 H;
    public String I;
    public int J;
    public n79 K;
    public Drawable L;
    public u20 M;
    public final RectF N;
    public boolean O;
    public int P;
    public yk Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public int V;
    public boolean W;
    public final wjb a;
    public final Paint a0;
    public final LinearLayout b;
    public final View c;
    public final t8 d;
    public final si9 e;
    public final mc9 f;
    public final mc9 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView w;
    public ImageView x;
    public lk0 y;

    public wi9(Context context, wjb wjbVar) {
        super(context);
        this.r = new ArrayList();
        this.N = new RectF();
        this.R = -1;
        this.S = -1;
        final byte b = 1;
        this.a0 = new Paint(1);
        this.a = wjbVar;
        setPadding(gl.L(16.0f), gl.L(5.0f), gl.L(16.0f), gl.L(4.66f));
        final byte b2 = 0;
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        t8 t8Var = new t8(this, context);
        this.d = t8Var;
        t8Var.setGravity(8388627);
        t8Var.setPaddingRelative(gl.L(6.0f), 0, 0, 0);
        t8Var.setSingleLine(true);
        t8Var.setIncludeFontPadding(false);
        t8Var.setTextSize(1, 16.0f);
        linearLayout.addView(t8Var, nme.o(18, -2));
        si9 si9Var = new si9(context, wjbVar);
        this.e = si9Var;
        si9Var.setVisibility(8);
        si9Var.setOnClickListener(new ni9(this, b2));
        linearLayout.addView(si9Var, nme.o(18, -2));
        mc9 mc9Var = new mc9(context, wjbVar);
        this.f = mc9Var;
        mc9Var.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        mc9Var.setListener(new qi9(this));
        mc9Var.setDelegate(new et3(this) { // from class: oi9
            public final /* synthetic */ wi9 b;

            {
                this.b = this;
            }

            @Override // et3
            public final void m() {
                byte b3 = b2;
                wi9 wi9Var = this.b;
                switch (b3) {
                    case 0:
                        if (!wi9Var.T && wi9Var.y != null) {
                            wi9Var.K();
                            wi9.b(wi9Var.y.b, wi9Var.f.getText());
                            ti9 ti9Var = wi9Var.E;
                            if (ti9Var != null) {
                                ((ie9) ti9Var).a.W3();
                                break;
                            }
                        }
                        break;
                    default:
                        if (wi9Var.y != null) {
                            wi9Var.v();
                            ti9 ti9Var2 = wi9Var.E;
                            if (ti9Var2 != null) {
                                ((ie9) ti9Var2).a.W3();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        mc9Var.setOnFocusChangeListener(new ls0(this, (byte) 16));
        linearLayout.addView(mc9Var, nme.l(1.0f, 0, -2));
        addView(linearLayout, nme.e(-1, -2, 51));
        mc9 mc9Var2 = new mc9(context, wjbVar);
        this.h = mc9Var2;
        mc9Var2.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(1.0f));
        mc9Var2.setAllowNewlines(false);
        mc9Var2.setInputType(147457);
        mc9Var2.setListener(new ri9(this));
        mc9Var2.setDelegate(new et3(this) { // from class: oi9
            public final /* synthetic */ wi9 b;

            {
                this.b = this;
            }

            @Override // et3
            public final void m() {
                byte b3 = b;
                wi9 wi9Var = this.b;
                switch (b3) {
                    case 0:
                        if (!wi9Var.T && wi9Var.y != null) {
                            wi9Var.K();
                            wi9.b(wi9Var.y.b, wi9Var.f.getText());
                            ti9 ti9Var = wi9Var.E;
                            if (ti9Var != null) {
                                ((ie9) ti9Var).a.W3();
                                break;
                            }
                        }
                        break;
                    default:
                        if (wi9Var.y != null) {
                            wi9Var.v();
                            ti9 ti9Var2 = wi9Var.E;
                            if (ti9Var2 != null) {
                                ((ie9) ti9Var2).a.W3();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        mc9Var2.setVisibility(8);
        addView(mc9Var2, nme.e(-1, -2, 51));
        I();
    }

    public static String E(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                        return null;
                    }
                }
                return str;
            }
        }
        return null;
    }

    public static void b(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = yi9.f(charSequence);
    }

    public static void c(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    public static void g(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    private String getHint() {
        lk0 lk0Var = this.y;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                return k96.M0(lk0Var.p ? 2131754011 : 2131754027, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                return k96.M0(2131754026, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                return k96.M0(2131754025, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                return k96.M0(2131754024, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                return k96.M0(2131754023, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                return k96.M0(2131754022, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return k96.M0(2131754016, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return k96.M0(2131754013, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return k96.M0(2131754013, null);
            }
            if (lk0Var.q) {
                return k96.M0(2131754012, null);
            }
        }
        return null;
    }

    public static TL_iv.RichText h(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    public static boolean j(mc9 mc9Var, int i, int i2, int i3, int i4) {
        return mc9Var.length() == 0 && i3 >= i && i3 <= mc9Var.getWidth() + i && i4 >= i2 && i4 <= mc9Var.getHeight() + i2;
    }

    public static boolean n(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.equals("/img") || lowerCase.equals("/pic") || lowerCase.equals("/image") || lowerCase.equals("/picture") || lowerCase.equals("/photo")) {
            return 4;
        }
        if (lowerCase.equals("/vid") || lowerCase.equals("/video")) {
            return 5;
        }
        if (lowerCase.equals("/audio") || lowerCase.equals("/music")) {
            return 1;
        }
        if (lowerCase.equals("/map") || lowerCase.equals("/location") || lowerCase.equals("/loc")) {
            return 2;
        }
        if (lowerCase.equals("/latex") || lowerCase.equals("/equation") || lowerCase.equals("/math")) {
            return 3;
        }
        if (lowerCase.equals("/toggle") || lowerCase.equals("/details")) {
            return 6;
        }
        return lowerCase.equals("/button") ? 7 : 0;
    }

    public static vi9 q(lk0 lk0Var, String str) {
        int i;
        int i2;
        char charAt;
        char charAt2;
        if (str == null || lk0Var == null) {
            return null;
        }
        String trim = str.trim();
        int i3 = 2;
        if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
            return new vi9(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new vi9(u(charAt - '0'), lk0Var.c, lk0Var.d);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new vi9(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new vi9(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new vi9(pageblockblockquote, 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new vi9(pageblockpullquote, 0, 0);
        }
        if (!lowerCase.equals("/table") && !lowerCase.startsWith("/table ")) {
            return null;
        }
        if (lowerCase.length() > 7) {
            String trim2 = lowerCase.substring(7).trim();
            int indexOf = trim2.indexOf(120);
            if (indexOf < 0) {
                indexOf = trim2.indexOf(88);
            }
            if (indexOf > 0) {
                try {
                    i2 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                    try {
                        i3 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                    } catch (NumberFormatException unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i2 = 2;
                }
                i = i3;
                i3 = i2;
                return new vi9(t(i3, i), 0, 0);
            }
        }
        i = 2;
        return new vi9(t(i3, i), 0, 0);
    }

    public static vi9 r(lk0 lk0Var, String str) {
        int length;
        char charAt;
        if (lk0Var == null || str == null || (length = str.length()) < 2) {
            return null;
        }
        int i = length - 1;
        if (str.charAt(i) != ' ') {
            return null;
        }
        TL_iv.PageBlock pageBlock = lk0Var.b;
        boolean z = pageBlock instanceof TL_iv.pageBlockParagraph;
        boolean z2 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        if (str.charAt(0) == '#' && (z || z2)) {
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                if (str.charAt(i3) != '#') {
                    return null;
                }
                i2++;
            }
            if (i2 < 1 || i2 > 6) {
                return null;
            }
            return new vi9(u(i2), lk0Var.c, lk0Var.d);
        }
        if (!z) {
            return null;
        }
        if (lk0Var.c == 0 && length == 2) {
            char charAt2 = str.charAt(0);
            if (charAt2 == '-' || charAt2 == '*' || charAt2 == '+') {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                c(pageblockparagraph, "");
                return new vi9(pageblockparagraph, 1, 0);
            }
            if (charAt2 == '|') {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new vi9(pageblockblockquote, 0, 0);
            }
        }
        if (lk0Var.c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
            return s(false);
        }
        if (lk0Var.c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
            char charAt3 = str.charAt(1);
            if (charAt3 == ' ') {
                return s(false);
            }
            if (charAt3 == 'x' || charAt3 == 'X') {
                return s(true);
            }
        }
        if (lk0Var.c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
            c(pageblockparagraph2, "");
            return new vi9(pageblockparagraph2, 1, 1);
        }
        if (lk0Var.c != 0 || length != 4) {
            return null;
        }
        char charAt4 = str.charAt(0);
        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
            return new vi9(new TL_iv.pageBlockDivider(), 0, 0);
        }
        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
            return new vi9(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static vi9 s(boolean z) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        c(pageblockparagraph, "");
        return new vi9(pageblockparagraph, 1, 0, true, z);
    }

    public static TL_iv.pageBlockTable t(int i, int i2) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i3 = 0; i3 < i; i3++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i4 = 0; i4 < i2; i4++) {
                pagetablerow.cells.add(ffb.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock u(int i) {
        switch (i) {
            case 1:
                return new TL_iv.pageBlockHeading1();
            case 2:
                return new TL_iv.pageBlockHeading2();
            case 3:
                return new TL_iv.pageBlockHeading3();
            case 4:
                return new TL_iv.pageBlockHeading4();
            case 5:
                return new TL_iv.pageBlockHeading5();
            case 6:
                return new TL_iv.pageBlockHeading6();
            default:
                return null;
        }
    }

    public static boolean x(mc9 mc9Var, int i, int i2, int i3, int i4) {
        int lineForVertical;
        Layout layout = mc9Var.getLayout();
        if (layout != null && mc9Var.length() != 0) {
            int paddingLeft = i3 - (mc9Var.getPaddingLeft() + i);
            int paddingTop = i4 - (mc9Var.getPaddingTop() + i2);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = gl.L(24.0f);
                int max = Math.max(0, (mc9Var.getWidth() - mc9Var.getPaddingLeft()) - mc9Var.getPaddingRight());
                float f = L;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f);
                float f2 = paddingLeft;
                if (f2 >= max2 && f2 <= min) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String y(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return yi9.l(pageBlock.text);
    }

    public static SpannableStringBuilder z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return yi9.r(pageBlock.text, pageBlock, true);
    }

    public final void A() {
        this.f.O();
    }

    public final void B() {
        Runnable runnable = this.H;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.H = null;
        }
        lk0 lk0Var = this.y;
        byte b = 1;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                od9 od9Var = new od9(this, b);
                this.H = od9Var;
                postDelayed(od9Var, 100L);
                return;
            }
        }
        this.J++;
        Editable text = this.f.getText();
        if (text != null) {
            for (jj2 jj2Var : (jj2[]) text.getSpans(0, text.length(), jj2.class)) {
                text.removeSpan(jj2Var);
            }
        }
        this.I = null;
    }

    public final void C(ub9 ub9Var) {
        if (this.E == null || this.y == null || ub9Var == null) {
            return;
        }
        List<String> list = ub9Var.c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int p = p(str);
            if (p != 0) {
                ((ie9) this.E).c(this.y, p);
                return;
            }
            vi9 q = q(this.y, str);
            if (q == null) {
                q = r(this.y, tb4.o(str, " "));
            }
            if (q != null) {
                ((ie9) this.E).d(this.y, q.a, q.b, q.c, q.d, q.e);
                return;
            }
        }
    }

    public final void D(Editable editable) {
        lk0 lk0Var = this.y;
        if (lk0Var != null && ye9.y3(lk0Var.b) && ug8.A(editable)) {
            mc9 mc9Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = mc9Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((mc9Var.getTextSize() * 0.85f) / 1.2f));
            for (su3 su3Var : (su3[]) editable.getSpans(0, editable.length(), su3.class)) {
                su3Var.b = 0.85f;
            }
            for (gm gmVar : (gm[]) editable.getSpans(0, editable.length(), gm.class)) {
                gmVar.replaceFontMetrics(fontMetricsInt);
                gmVar.setSize(max);
            }
        }
    }

    public final void F() {
        ti9 ti9Var;
        lk0 lk0Var = this.y;
        if (lk0Var == null || lk0Var.c <= 0 || (ti9Var = this.E) == null) {
            return;
        }
        int b = ((ie9) ti9Var).b(lk0Var);
        int a = ((ie9) this.E).a(this.y);
        lk0 lk0Var2 = this.y;
        if (lk0Var2.n) {
            b = lk0Var2.l <= 0 ? 0 : gl.L(((r0 - 1) << 4) + 10);
        }
        lk0 lk0Var3 = this.y;
        if (lk0Var3.o) {
            a = lk0Var3.m <= 0 ? 0 : gl.L(((r1 - 1) << 4) + 10);
        }
        if (b == getPaddingTop() && a == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), b, getPaddingRight(), a);
    }

    public final void G() {
        lk0 lk0Var = this.y;
        mc9 mc9Var = this.f;
        mc9 mc9Var2 = this.h;
        if (lk0Var != null && n(lk0Var.b) && (mc9Var.length() > 0 || mc9Var2.length() > 0)) {
            if (mc9Var2.getVisibility() != 0) {
                mc9Var2.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (mc9Var2.getVisibility() != 8) {
            if (mc9Var2.isFocused()) {
                mc9Var.requestFocus();
            }
            mc9Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i;
        Layout layout;
        int lineStart;
        mc9 mc9Var = this.f;
        if (mc9Var.getText() != null) {
            Editable text = mc9Var.getText();
            int i2 = -1;
            if (!m() || !((TL_iv.pageBlockBlockquote) this.y.b).collapsed || (layout = mc9Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i = text.length())) {
                i = -1;
            } else {
                i2 = lineStart;
            }
            if (i2 == this.R && i == this.S) {
                return;
            }
            this.T = true;
            try {
                yk ykVar = this.Q;
                if (ykVar != null) {
                    text.removeSpan(ykVar);
                }
                if (i2 >= 0) {
                    yk ykVar2 = this.Q;
                    if (ykVar2 == null) {
                        ykVar2 = new yk(this, (byte) 2);
                        this.Q = ykVar2;
                    }
                    text.setSpan(ykVar2, i2, i, 33);
                }
                this.T = false;
                this.R = i2;
                this.S = i;
            } catch (Throwable th) {
                this.T = false;
                throw th;
            }
        }
    }

    public final void I() {
        this.f.updateColors();
        mc9 mc9Var = this.h;
        if (mc9Var != null) {
            mc9Var.updateColors();
        }
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.d.setTextColor(bkb.v0(i, wjbVar));
        if (this.L != null) {
            int v0 = bkb.v0(bkb.Ei, wjbVar);
            Drawable drawable = this.L;
            if (drawable != this.U || v0 != this.V) {
                this.U = drawable;
                this.V = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
        }
        n79 n79Var = this.K;
        if (n79Var != null) {
            rse.a(n79Var, wjbVar);
        }
    }

    public final void J(TL_iv.PageBlock pageBlock, boolean z) {
        boolean z2 = pageBlock instanceof TL_iv.pageBlockPreformatted;
        LinearLayout linearLayout = this.s;
        if (!z2) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (linearLayout != null && z) {
            gl.B2(linearLayout);
            this.s = null;
        }
        if (this.s == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.s = linearLayout2;
            linearLayout2.setOrientation(0);
            LinearLayout linearLayout3 = this.s;
            int i = bkb.h6;
            zkb.R(linearLayout3, bkb.Y(bkb.v0(i, this.a), gl.L(3.0f), gl.L(3.0f)), null, zkb.M(i), this.a);
            this.s.setPadding(gl.L(6.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
            addView(this.s, nme.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.w = textView;
            byte b = 1;
            textView.setTextSize(1, 12.0f);
            this.w.setGravity(17);
            this.s.addView(this.w, nme.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.x = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.s.addView(this.x, nme.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            jj8 jj8Var = qj2.a;
            synchronized (jj8Var.a) {
                if (!jj8Var.f) {
                    jj8Var.b.execute(new ej8(jj8Var, (byte) 1));
                }
            }
            this.s.setOnClickListener(new ni9(this, b));
            this.s.setOnLongClickListener(new pi9());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i2 = bkb.F6;
        bkb.p1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, bkb.v0(i2, this.a));
        vkb K = zkb.K(TextUtils.isEmpty(str) ? 0.5f : 0.75f, i2);
        ImageView imageView2 = this.x;
        wjb wjbVar = this.a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = K.a;
        float f = K.d;
        int P = zkb.P(i3, -1, 2, f, wjbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        zkb.N(imageView2, 5, i3, -1, 2, f, wjbVar, P, porterDuffColorFilter).h = mode;
        zkb.Y(this.w, K, this.a);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView2 = this.w;
        if (isEmpty) {
            textView2.setText(k96.M0(2131754014, null));
        } else {
            textView2.setText(h27.b(str));
        }
        this.s.setVisibility(0);
    }

    public final void K() {
        lk0 lk0Var = this.y;
        boolean z = false;
        if (lk0Var != null && lk0Var.d > 0) {
            mc9 mc9Var = this.f;
            if (mc9Var.length() > 0 && (mc9Var.c(0, 1) & 1) != 0) {
                z = true;
            }
        }
        this.d.setTypeface(z ? gl.o() : null);
        lk0 lk0Var2 = this.y;
        if (lk0Var2 == null || lk0Var2.d <= 0) {
            return;
        }
        a(lk0Var2);
    }

    public final void a(lk0 lk0Var) {
        int e;
        int i;
        lk0 lk0Var2;
        int i2;
        int i3 = lk0Var.c;
        si9 si9Var = this.e;
        t8 t8Var = this.d;
        View view = this.c;
        if (i3 <= 0) {
            view.setVisibility(8);
            t8Var.setVisibility(8);
            si9Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = gl.L(24.0f) * (i3 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i3 > 1 ? 0 : 8);
        if (lk0Var.e) {
            t8Var.setVisibility(8);
            si9Var.setVisibility(0);
            ((CheckBoxBase) si9Var.b).f(-1, lk0Var.f, false);
            return;
        }
        si9Var.setVisibility(8);
        t8Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) t8Var.getLayoutParams();
        if (lk0Var.d == 0) {
            e = gl.L(18.0f);
        } else {
            ti9 ti9Var = this.E;
            if (ti9Var != null) {
                TextPaint paint = t8Var.getPaint();
                ArrayList arrayList = ((ie9) ti9Var).a.t3;
                int indexOf = arrayList.indexOf(lk0Var);
                if (indexOf < 0 || (i = lk0Var.c) <= 0 || lk0Var.d <= 0) {
                    e = ls6.e(10.0f, (int) Math.ceil(paint.measureText(de9.l(new StringBuilder(), lk0Var.d, "."))), gl.L(28.0f));
                } else {
                    int i4 = indexOf;
                    while (i4 > 0) {
                        lk0 lk0Var3 = (lk0) arrayList.get(i4 - 1);
                        int i5 = lk0Var3.c;
                        if (i5 < i || (i5 == i && lk0Var3.d <= 0)) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                    int i6 = indexOf + 1;
                    while (i6 < arrayList.size() && (i2 = (lk0Var2 = (lk0) arrayList.get(i6)).c) >= i && (i2 != i || lk0Var2.d > 0)) {
                        i6++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(gl.o());
                    float f = 0.0f;
                    while (i4 < i6) {
                        lk0 lk0Var4 = (lk0) arrayList.get(i4);
                        if (lk0Var4.c == i && lk0Var4.d > 0) {
                            f = Math.max(f, paint2.measureText(lk0Var4.d + "."));
                        }
                        i4++;
                    }
                    e = ls6.e(10.0f, (int) Math.ceil(f), gl.L(28.0f));
                }
            } else {
                int L = gl.L(28.0f);
                TextPaint paint3 = t8Var.getPaint();
                e = ls6.e(10.0f, (int) Math.ceil(paint3.measureText(lk0Var.d + ".")), L);
            }
        }
        if (layoutParams2.width != e) {
            layoutParams2.width = e;
            t8Var.setLayoutParams(layoutParams2);
        }
        t8Var.setText(lk0Var.d == 0 ? "" : de9.l(new StringBuilder(), lk0Var.d, "."));
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ei));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(lk0 lk0Var, ti9 ti9Var, boolean z) {
        float f;
        float f2;
        lk0 lk0Var2;
        int c;
        boolean z2;
        boolean n;
        SpannableStringBuilder spannableStringBuilder;
        this.y = lk0Var;
        this.E = ti9Var;
        this.F = z;
        this.S = -1;
        this.R = -1;
        TL_iv.PageBlock pageBlock = lk0Var.b;
        mc9 mc9Var = this.f;
        mc9Var.setBlock(pageBlock);
        TL_iv.PageBlock pageBlock2 = lk0Var.b;
        int i = gba.S0;
        mc9Var.setCenterEmptyHint(false);
        mc9Var.setHint(getHint());
        mc9Var.setTextColorKey(bkb.F6);
        mc9Var.setLineSpacing(0.0f, 1.0f);
        if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
            f = 8.0f;
            setPadding(gl.L(16.0f), gl.L(31.0f), gl.L(16.0f), gl.L(19.0f));
            mc9Var.setInputType(655505);
            mc9Var.setAllowNewlines(true);
            mc9Var.setSoftEnterNewline(false);
            mc9Var.setGravity(8388659);
            mc9Var.setTextSize(1, i - 1);
            mc9Var.setTypeface(Typeface.MONOSPACE);
            mc9Var.setLineSpacing(mc9Var.getPaint().getFontSpacing() * 0.3f, 1.0f);
            mc9Var.setAccentHint(false);
        } else {
            f = 8.0f;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                mc9Var.setInputType(147457);
                mc9Var.setAllowNewlines(false);
                mc9Var.setSoftEnterNewline(false);
                mc9Var.setGravity(8388659);
                setPadding(gl.L(28.0f), gl.L(16.0f), gl.L(24.0f), gl.L(16.0f));
                mc9Var.setTextSize(1, Math.max(8, i - 2));
                mc9Var.setTypeface(null);
                mc9Var.setAccentHint(true);
            } else {
                if (!(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                    mc9Var.setInputType(147457);
                    mc9Var.setAllowNewlines(false);
                    mc9Var.setSoftEnterNewline(false);
                    mc9Var.setGravity(8388659);
                    boolean z3 = pageBlock2 instanceof TL_iv.pageBlockHeading1;
                    boolean z4 = z3 || (pageBlock2 instanceof TL_iv.pageBlockHeading2) || (pageBlock2 instanceof TL_iv.pageBlockHeading3) || (pageBlock2 instanceof TL_iv.pageBlockHeading4) || (pageBlock2 instanceof TL_iv.pageBlockHeading5) || (pageBlock2 instanceof TL_iv.pageBlockHeading6);
                    f2 = 24.0f;
                    setPadding(gl.L(16.0f), gl.L(z4 ? 11.0f : 5.0f), gl.L(16.0f), gl.L(z4 ? 7.0f : 4.66f));
                    lk0 lk0Var3 = this.y;
                    if (lk0Var3 != null && lk0Var3.c > 0) {
                        int L = gl.L(16.0f);
                        ti9 ti9Var2 = this.E;
                        int b = ti9Var2 != null ? ((ie9) ti9Var2).b(this.y) : gl.L(8.0f);
                        int L2 = gl.L(16.0f);
                        ti9 ti9Var3 = this.E;
                        setPadding(L, b, L2, ti9Var3 != null ? ((ie9) ti9Var3).a(this.y) : gl.L(11.0f));
                    }
                    if (z3) {
                        mc9Var.setTextSize(1, i + 3);
                        mc9Var.setTypeface(gl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        mc9Var.setTextSize(1, i + 2);
                        mc9Var.setTypeface(gl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        mc9Var.setTextSize(1, i + 1);
                        mc9Var.setTypeface(gl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        mc9Var.setTextSize(1, i);
                        mc9Var.setTypeface(gl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        mc9Var.setTextSize(1, i - 1);
                        mc9Var.setTypeface(gl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        mc9Var.setTextSize(1, i - 2);
                        mc9Var.setTypeface(gl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        mc9Var.setTextSize(1, i - 2);
                        mc9Var.setTypeface(null);
                        mc9Var.setTextColorKey(bkb.Od);
                    } else {
                        mc9Var.setTextSize(1, (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) || (lk0Var2 = this.y) == null || lk0Var2.k.isEmpty()) ? i : Math.max(8, i - 2));
                        mc9Var.setTypeface(null);
                    }
                    mc9Var.setAccentHint(false);
                    c = rse.c(lk0Var);
                    int d = rse.d(lk0Var);
                    if (c <= 0 || d > 0) {
                        z2 = lk0Var.b instanceof TL_iv.pageBlockPreformatted;
                        int paddingTop = getPaddingTop();
                        int paddingBottom = getPaddingBottom();
                        if (lk0Var.n) {
                            paddingTop = (lk0Var.l <= 0 ? 0 : gl.L(((r7 - 1) << 4) + 10)) + (z2 ? gl.L(f2) : 0);
                        }
                        if (lk0Var.o) {
                            paddingBottom = lk0Var.m <= 0 ? 0 : gl.L(((r8 - 1) << 4) + 10);
                        }
                        if (z2) {
                            c += gl.L(f);
                            d += gl.L(f);
                        }
                        if (k96.a0) {
                            setPadding(getPaddingLeft() + c, paddingTop, getPaddingRight() + d, paddingBottom);
                        } else {
                            setPadding(getPaddingLeft() + d, paddingTop, getPaddingRight() + c, paddingBottom);
                        }
                    }
                    a(lk0Var);
                    J(lk0Var.b, false);
                    if (!String.valueOf(mc9Var.getText()).equals(y(lk0Var.b))) {
                        SpannableStringBuilder z5 = z(lk0Var.b);
                        if (ye9.y3(lk0Var.b)) {
                            SpannableString spannableString = new SpannableString(z5);
                            yi9.o(spannableString, 0, spannableString.length(), 1, false, null);
                            yi9.o(spannableString, 0, spannableString.length(), 2, false, null);
                            spannableStringBuilder = spannableString;
                        } else {
                            spannableStringBuilder = z5;
                        }
                        mc9Var.setTextSilently(vu3.n(spannableStringBuilder, mc9Var.getPaint().getFontMetricsInt(), false, null, 0, ye9.y3(lk0Var.b) ? 0.85f : 1.0f, 0));
                        D(mc9Var.getText());
                        mc9Var.f();
                        this.I = null;
                    }
                    D(mc9Var.getText());
                    K();
                    TL_iv.PageBlock pageBlock3 = lk0Var.b;
                    n = n(pageBlock3);
                    mc9 mc9Var2 = this.h;
                    if (n) {
                        mc9Var2.setVisibility(8);
                    } else {
                        g(pageBlock3);
                        mc9Var2.setTextSize(1, Math.max(8, gba.S0 - 2));
                        mc9Var2.setTypeface(gl.n1("fonts/rmedium.ttf"));
                        mc9Var2.setTextColorKey(bkb.Ei);
                        mc9Var2.setAccentHint(true);
                        mc9Var2.setHint(k96.M0(2131754017, null));
                        if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                            mc9Var2.setGravity(49);
                        } else {
                            mc9Var2.setGravity(8388659);
                        }
                        if (!String.valueOf(mc9Var2.getText()).equals(yi9.l(h(pageBlock3)))) {
                            mc9Var2.setTextSilently(vu3.m(yi9.r(h(pageBlock3), null, true), mc9Var2.getPaint().getFontMetricsInt(), false, null, 0));
                            mc9Var2.f();
                        }
                        G();
                    }
                    B();
                }
                mc9Var.setInputType(147457);
                mc9Var.setAllowNewlines(false);
                mc9Var.setSoftEnterNewline(true);
                mc9Var.setGravity(49);
                mc9Var.setCenterEmptyHint(true);
                setPadding(gl.L(40.0f), gl.L(16.0f), gl.L(40.0f), gl.L(16.0f));
                mc9Var.setTextSize(1, Math.max(8, i - 2));
                mc9Var.setTypeface(gl.n1("fonts/ritalic.ttf"));
                mc9Var.setAccentHint(true);
            }
        }
        f2 = 24.0f;
        c = rse.c(lk0Var);
        int d2 = rse.d(lk0Var);
        if (c <= 0) {
        }
        z2 = lk0Var.b instanceof TL_iv.pageBlockPreformatted;
        int paddingTop2 = getPaddingTop();
        int paddingBottom2 = getPaddingBottom();
        if (lk0Var.n) {
        }
        if (lk0Var.o) {
        }
        if (z2) {
        }
        if (k96.a0) {
        }
        a(lk0Var);
        J(lk0Var.b, false);
        if (!String.valueOf(mc9Var.getText()).equals(y(lk0Var.b))) {
        }
        D(mc9Var.getText());
        K();
        TL_iv.PageBlock pageBlock32 = lk0Var.b;
        n = n(pageBlock32);
        mc9 mc9Var22 = this.h;
        if (n) {
        }
        B();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0445 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x040b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        mc9 mc9Var;
        float f;
        fib textSelectionHelper;
        float f2;
        float f3;
        Canvas canvas3;
        float f4;
        int i;
        lk0 lk0Var = this.y;
        Paint paint = this.a0;
        LinearLayout linearLayout = this.b;
        wjb wjbVar = this.a;
        mc9 mc9Var2 = this.f;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                paint.setColor(bkb.v0(bkb.nl, wjbVar));
                int c = rse.c(this.y);
                int d = rse.d(this.y);
                int width = getWidth();
                if (c > 0 || d > 0) {
                    int L = gl.L(16.0f) + c;
                    int L2 = gl.L(16.0f) + d;
                    i = k96.a0 ? L2 : L;
                    int width2 = getWidth();
                    if (!k96.a0) {
                        L = L2;
                    }
                    width = width2 - L;
                } else {
                    i = 0;
                }
                float L3 = (i > 0 || width < getWidth()) ? gl.L(8.0f) : 0;
                mc9Var = mc9Var2;
                canvas2 = canvas;
                canvas2.drawRoundRect(i, gl.L(7.0f), width, getHeight() - gl.L(7.0f), L3, L3, paint);
            } else {
                mc9Var = mc9Var2;
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    if (this.K == null) {
                        n79 n79Var = new n79(this);
                        this.K = n79Var;
                        n79Var.a(null, null, null, this.a, 1);
                        rse.a(this.K, wjbVar);
                    }
                    RectF rectF = gl.P;
                    rectF.set(gl.L(16.0f), gl.L(8.0f), getWidth() - gl.L(16.0f), getHeight() - gl.L(8.0f));
                    float floor = (float) Math.floor(gba.U0 / 3.0f);
                    canvas3 = canvas;
                    this.K.c(floor, floor, floor, 1.0f, canvas3, rectF);
                    this.K.f(canvas3, rectF, 1.0f);
                } else {
                    canvas3 = canvas;
                    if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        if (this.K == null) {
                            n79 n79Var2 = new n79(this);
                            this.K = n79Var2;
                            n79Var2.a(null, null, null, this.a, 1);
                            rse.a(this.K, wjbVar);
                        }
                        if (this.L == null) {
                            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                            this.L = mutate;
                            mutate.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.Ei, wjbVar), PorterDuff.Mode.SRC_IN));
                        }
                        Layout layout = mc9Var.getLayout();
                        float width3 = getWidth();
                        if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                            f4 = 0.0f;
                            for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
                                width3 = Math.min(width3, layout.getLineLeft(i2) + mc9Var.getPaddingLeft() + mc9Var.getLeft() + linearLayout.getLeft());
                                f4 = Math.max(f4, layout.getLineRight(i2) + mc9Var.getPaddingLeft() + mc9Var.getLeft() + linearLayout.getLeft());
                            }
                        } else if (mc9Var.getHint() != null) {
                            float measureText = mc9Var.getPaint().measureText(mc9Var.getHint().toString());
                            width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + gl.L(2.0f));
                            f4 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + gl.L(2.0f));
                        } else {
                            f4 = 0.0f;
                        }
                        mc9 mc9Var3 = this.h;
                        if (mc9Var3.getVisibility() == 0) {
                            Layout layout2 = mc9Var3.getLayout();
                            if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                                for (int i3 = 0; i3 < layout2.getLineCount(); i3++) {
                                    width3 = Math.min(width3, layout2.getLineLeft(i3) + mc9Var3.getPaddingLeft() + mc9Var3.getLeft());
                                    f4 = Math.max(f4, layout2.getLineRight(i3) + mc9Var3.getPaddingLeft() + mc9Var3.getLeft());
                                }
                            } else if (mc9Var3.getHint() != null) {
                                float measureText2 = mc9Var3.getPaint().measureText(mc9Var3.getHint().toString());
                                width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + gl.L(2.0f));
                                f4 = Math.max(f4, ((getWidth() + measureText2) / 2.0f) + gl.L(2.0f));
                            }
                        }
                        if (width3 < f4) {
                            float L4 = width3 - gl.L(30.0f);
                            float L5 = gl.L(30.0f) + f4;
                            float floor2 = (float) Math.floor(gba.U0 / 2.0f);
                            int L6 = gl.L(8.0f);
                            int height = getHeight() - gl.L(8.0f);
                            RectF rectF2 = gl.P;
                            f = 2.0f;
                            rectF2.set(L4, L6, L5, height);
                            this.K.c(floor2, floor2, floor2, 1.0f, canvas3, rectF2);
                            canvas2 = canvas3;
                            canvas2.save();
                            int i4 = (int) L4;
                            this.L.setBounds(gl.L(8.0f) + i4, gl.L(7.0f) + L6, this.L.getIntrinsicWidth() + gl.L(8.0f) + i4, this.L.getIntrinsicHeight() + gl.L(7.0f) + L6);
                            canvas2.scale(-1.0f, -1.0f, this.L.getBounds().centerX(), this.L.getBounds().centerY());
                            this.L.draw(canvas2);
                            canvas2.restore();
                            canvas2.save();
                            int i5 = (int) L5;
                            this.L.setBounds((i5 - gl.L(8.0f)) - this.L.getIntrinsicWidth(), (height - gl.L(7.0f)) - this.L.getIntrinsicHeight(), i5 - gl.L(8.0f), height - gl.L(7.0f));
                            canvas2.scale(1.0f, -1.0f, this.L.getBounds().centerX(), this.L.getBounds().centerY());
                            this.L.draw(canvas2);
                            canvas2.restore();
                            if (this.W) {
                                float width4 = getWidth();
                                float height2 = getHeight();
                                Layout layout3 = mc9Var.getLayout();
                                if (layout3 != null) {
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                    for (int i6 = 0; i6 < layout3.getLineCount(); i6++) {
                                        height2 = Math.min(height2, layout3.getLineTop(i6) + mc9Var.getPaddingTop() + getPaddingTop());
                                        width4 = Math.min(width4, layout3.getLineLeft(i6) + mc9Var.getPaddingLeft() + mc9Var.getLeft() + linearLayout.getLeft());
                                        f2 = Math.max(f2, layout3.getLineRight(i6) + mc9Var.getPaddingLeft() + mc9Var.getLeft() + linearLayout.getLeft());
                                        f3 = Math.max(height2, layout3.getLineBottom(i6) + mc9Var.getPaddingTop() + getPaddingTop());
                                    }
                                } else {
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                }
                                if (width4 < f2 && height2 < f3) {
                                    float L7 = width4 - gl.L(4.0f);
                                    paint.setColor(bkb.p1(0.05f, bkb.v0(bkb.F6, wjbVar)));
                                    canvas2.drawRoundRect(L7, height2 - gl.L(f), f2 + gl.L(4.0f), f3 + gl.L(f), gl.L(4.0f), gl.L(4.0f), paint);
                                }
                            }
                            ti9 ti9Var = this.E;
                            textSelectionHelper = ti9Var == null ? ((ie9) ti9Var).a.getTextSelectionHelper() : null;
                            if (textSelectionHelper != null) {
                                ArrayList arrayList = this.r;
                                arrayList.clear();
                                k(arrayList);
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    pib pibVar = (pib) arrayList.get(i7);
                                    canvas2.save();
                                    canvas2.translate(pibVar.getX(), pibVar.getY());
                                    textSelectionHelper.Y(canvas2, this, i7);
                                    canvas2.restore();
                                }
                            }
                            super.dispatchDraw(canvas);
                            if (m()) {
                                return;
                            }
                            if (this.M == null) {
                                this.M = new u20(this);
                            }
                            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.y.b;
                            int v0 = bkb.v0(bkb.Ei, wjbVar);
                            int L8 = gl.L(3.333f);
                            this.M.d(canvas2, this.N, ls6.x(16.0f, getWidth(), L8), ls6.x(8.0f, getHeight(), L8), v0, pageblockblockquote.collapsed, i());
                            return;
                        }
                    }
                }
                canvas2 = canvas3;
            }
        } else {
            canvas2 = canvas;
            mc9Var = mc9Var2;
        }
        f = 2.0f;
        if (this.W) {
        }
        ti9 ti9Var2 = this.E;
        if (ti9Var2 == null) {
        }
        if (textSelectionHelper != null) {
        }
        super.dispatchDraw(canvas);
        if (m()) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (i() && this.M != null) {
            boolean contains = this.N.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.O) {
                            this.O = false;
                            this.M.f(false);
                            return true;
                        }
                    } else if (this.O) {
                        this.M.f(contains);
                        return true;
                    }
                } else if (this.O) {
                    this.O = false;
                    this.M.f(false);
                    if (contains && m()) {
                        ((TL_iv.pageBlockBlockquote) this.y.b).collapsed = !r6.collapsed;
                        H();
                        invalidate();
                        ti9 ti9Var = this.E;
                        if (ti9Var != null) {
                            ye9 ye9Var = ((ie9) ti9Var).a;
                            ld9 ld9Var = ye9Var.R3;
                            if (ld9Var != null) {
                                ld9Var.g();
                            }
                            ye9Var.p3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.O = true;
                this.M.f(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int e(int i, int i2) {
        Layout layout;
        if (i()) {
            mc9 mc9Var = this.h;
            if (mc9Var.getVisibility() == 0 && (layout = mc9Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.M == null) {
                    this.M = new u20(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + mc9Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + mc9Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + mc9Var.getPaddingTop() + measuredHeight;
                int L = gl.L(3.333f);
                float x = ls6.x(16.0f, i, L);
                this.M.getClass();
                float L2 = x - ((gl.L(23.66f) + r6.b) + (gl.L(3.333f) << 1));
                this.M.getClass();
                int i3 = i2 - L;
                float L3 = i3 - gl.L(17.66f);
                float f = i3;
                boolean z = lineRight > L2;
                boolean z2 = lineBottom > L3 && lineTop < f;
                if (z && z2) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + gl.L(4.0f)) + r9) + L) - i2));
                }
            }
        }
        return 0;
    }

    public final void f() {
        lk0 lk0Var = this.y;
        if (lk0Var != null) {
            g(lk0Var.b);
        }
        mc9 mc9Var = this.h;
        if (mc9Var.getVisibility() != 0) {
            mc9Var.setVisibility(0);
            requestLayout();
        }
        mc9Var.O();
        mc9Var.setSelection(mc9Var.length());
    }

    public mc9 getAuthorEditText() {
        return this.h;
    }

    public mc9 getEditText() {
        return this.f;
    }

    public lk0 getRow() {
        return this.y;
    }

    public fk4 getStyleDelegate() {
        return this.f;
    }

    public final boolean i() {
        Layout layout;
        return m() && (layout = this.f.getLayout()) != null && layout.getLineCount() > 3;
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        Layout layout;
        mc9 mc9Var = this.f;
        Layout layout2 = mc9Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new xh9(layout2, mc9Var.getPaddingLeft() + mc9Var.getLeft() + linearLayout.getLeft(), mc9Var.getPaddingTop() + mc9Var.getTop() + linearLayout.getTop(), (byte) 1));
        }
        mc9 mc9Var2 = this.h;
        if (mc9Var2.getVisibility() != 0 || (layout = mc9Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new xh9(layout, mc9Var2.getPaddingLeft() + mc9Var2.getLeft(), mc9Var2.getPaddingTop() + mc9Var2.getTop(), (byte) 2));
    }

    public final boolean l() {
        return this.h.getVisibility() == 0;
    }

    public final boolean m() {
        lk0 lk0Var = this.y;
        return lk0Var != null && (lk0Var.b instanceof TL_iv.pageBlockBlockquote);
    }

    public final void o(boolean z) {
        ti9 ti9Var;
        this.f.setHint(getHint());
        if (z || (ti9Var = this.E) == null) {
            return;
        }
        ((ie9) ti9Var).a.p3.b(this, null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        H();
        mc9 mc9Var = this.h;
        if (mc9Var.getVisibility() == 8) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        mc9Var.layout(paddingLeft, measuredHeight, mc9Var.getMeasuredWidth() + paddingLeft, mc9Var.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        F();
        int size = View.MeasureSpec.getSize(i);
        mc9 mc9Var = this.h;
        if (mc9Var.getVisibility() == 8) {
            this.P = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, 0);
        mc9Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), 0);
        int paddingBottom = getPaddingBottom() + mc9Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int e = e(size, paddingBottom);
        this.P = e;
        setMeasuredDimension(size, paddingBottom + e);
    }

    public void setLocked(boolean z) {
        this.f.setLocked(z);
        this.h.setLocked(z);
    }

    public void setShowCommandBackground(boolean z) {
        if (this.W == z) {
            return;
        }
        this.W = z;
        invalidate();
    }

    @Override // tjb
    public final void updateColors() {
        try {
            I();
            if (getBackground() instanceof ed9) {
                ((ed9) getBackground()).a(bkb.v0(bkb.c6, this.a));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void v() {
        lk0 lk0Var = this.y;
        if (lk0Var == null || !n(lk0Var.b)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.y.b;
        TL_iv.RichText f = yi9.f(this.h.getText());
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = f;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = f;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        u20 u20Var = this.M;
        if (u20Var != null) {
            return drawable == ((gn) u20Var.e) || drawable == ((by8) u20Var.f);
        }
        return false;
    }

    public final void w() {
        lk0 lk0Var = this.y;
        if (lk0Var != null) {
            b(lk0Var.b, this.f.getText());
        }
    }
}
