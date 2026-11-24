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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class xk9 extends FrameLayout implements vlb, fkb {
    public uk9 E;
    public boolean F;
    public boolean G;
    public rf9 H;
    public String I;
    public int J;
    public p99 K;
    public Drawable L;
    public u30 M;
    public final RectF N;
    public boolean O;
    public int P;
    public yl Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public int V;
    public boolean W;
    public final ylb a;
    public final Paint a0;
    public final LinearLayout b;
    public final View c;
    public final t8 d;
    public final xd9 e;
    public final ne9 f;
    public final ne9 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView w;
    public ImageView x;
    public ll0 y;

    public xk9(Context context, ylb ylbVar) {
        super(context);
        this.r = new ArrayList();
        this.N = new RectF();
        this.R = -1;
        this.S = -1;
        final byte b = 1;
        this.a0 = new Paint(1);
        this.a = ylbVar;
        setPadding(gm.L(16.0f), gm.L(5.0f), gm.L(16.0f), gm.L(4.66f));
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
        t8Var.setPaddingRelative(gm.L(6.0f), 0, 0, 0);
        t8Var.setSingleLine(true);
        t8Var.setIncludeFontPadding(false);
        t8Var.setTextSize(1, 16.0f);
        linearLayout.addView(t8Var, qoe.o(18, -2));
        xd9 xd9Var = new xd9(context, ylbVar);
        this.e = xd9Var;
        xd9Var.setVisibility(8);
        xd9Var.setOnClickListener(new pk9(this, b2));
        linearLayout.addView(xd9Var, qoe.o(18, -2));
        ne9 ne9Var = new ne9(context, ylbVar);
        this.f = ne9Var;
        ne9Var.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        ne9Var.setListener(new sk9(this));
        ne9Var.setDelegate(new ou3(this) { // from class: qk9
            public final /* synthetic */ xk9 b;

            {
                this.b = this;
            }

            @Override // ou3
            public final void m() {
                byte b3 = b2;
                xk9 xk9Var = this.b;
                switch (b3) {
                    case 0:
                        if (!xk9Var.T && xk9Var.y != null) {
                            xk9Var.K();
                            xk9.b(xk9Var.y.b, xk9Var.f.getText());
                            uk9 uk9Var = xk9Var.E;
                            if (uk9Var != null) {
                                ((mg9) uk9Var).a.W3();
                                break;
                            }
                        }
                        break;
                    default:
                        if (xk9Var.y != null) {
                            xk9Var.v();
                            uk9 uk9Var2 = xk9Var.E;
                            if (uk9Var2 != null) {
                                ((mg9) uk9Var2).a.W3();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ne9Var.setOnFocusChangeListener(new tt0(this, (byte) 16));
        linearLayout.addView(ne9Var, qoe.l(1.0f, 0, -2));
        addView(linearLayout, qoe.e(-1, -2, 51));
        ne9 ne9Var2 = new ne9(context, ylbVar);
        this.h = ne9Var2;
        ne9Var2.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(1.0f));
        ne9Var2.setAllowNewlines(false);
        ne9Var2.setInputType(147457);
        ne9Var2.setListener(new tk9(this));
        ne9Var2.setDelegate(new ou3(this) { // from class: qk9
            public final /* synthetic */ xk9 b;

            {
                this.b = this;
            }

            @Override // ou3
            public final void m() {
                byte b3 = b;
                xk9 xk9Var = this.b;
                switch (b3) {
                    case 0:
                        if (!xk9Var.T && xk9Var.y != null) {
                            xk9Var.K();
                            xk9.b(xk9Var.y.b, xk9Var.f.getText());
                            uk9 uk9Var = xk9Var.E;
                            if (uk9Var != null) {
                                ((mg9) uk9Var).a.W3();
                                break;
                            }
                        }
                        break;
                    default:
                        if (xk9Var.y != null) {
                            xk9Var.v();
                            uk9 uk9Var2 = xk9Var.E;
                            if (uk9Var2 != null) {
                                ((mg9) uk9Var2).a.W3();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ne9Var2.setVisibility(8);
        addView(ne9Var2, qoe.e(-1, -2, 51));
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
        pageBlock.text = zk9.f(charSequence);
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
        ll0 ll0Var = this.y;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                return jb6.M0(ll0Var.p ? 2131753979 : 2131753995, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                return jb6.M0(2131753994, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                return jb6.M0(2131753993, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                return jb6.M0(2131753992, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                return jb6.M0(2131753991, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                return jb6.M0(2131753990, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return jb6.M0(2131753984, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return jb6.M0(2131753981, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return jb6.M0(2131753981, null);
            }
            if (ll0Var.q) {
                return jb6.M0(2131753980, null);
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

    public static boolean j(ne9 ne9Var, int i, int i2, int i3, int i4) {
        return ne9Var.length() == 0 && i3 >= i && i3 <= ne9Var.getWidth() + i && i4 >= i2 && i4 <= ne9Var.getHeight() + i2;
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

    public static wk9 q(ll0 ll0Var, String str) {
        int i;
        int i2;
        char charAt;
        char charAt2;
        if (str == null || ll0Var == null) {
            return null;
        }
        String trim = str.trim();
        int i3 = 2;
        if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
            return new wk9(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new wk9(u(charAt - '0'), ll0Var.c, ll0Var.d);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new wk9(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new wk9(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new wk9(pageblockblockquote, 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new wk9(pageblockpullquote, 0, 0);
        }
        if (!lowerCase.equals("/table") && !lowerCase.startsWith("/table ")) {
            return null;
        }
        if (lowerCase.length() > 7) {
            String trim2 = lowerCase.substring(7).trim();
            int indexOf = trim2.indexOf(nm7.E1);
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
                return new wk9(t(i3, i), 0, 0);
            }
        }
        i = 2;
        return new wk9(t(i3, i), 0, 0);
    }

    public static wk9 r(ll0 ll0Var, String str) {
        int length;
        char charAt;
        if (ll0Var == null || str == null || (length = str.length()) < 2) {
            return null;
        }
        int i = length - 1;
        if (str.charAt(i) != ' ') {
            return null;
        }
        TL_iv.PageBlock pageBlock = ll0Var.b;
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
            return new wk9(u(i2), ll0Var.c, ll0Var.d);
        }
        if (!z) {
            return null;
        }
        if (ll0Var.c == 0 && length == 2) {
            char charAt2 = str.charAt(0);
            if (charAt2 == '-' || charAt2 == '*' || charAt2 == '+') {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                c(pageblockparagraph, "");
                return new wk9(pageblockparagraph, 1, 0);
            }
            if (charAt2 == '|') {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new wk9(pageblockblockquote, 0, 0);
            }
        }
        if (ll0Var.c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
            return s(false);
        }
        if (ll0Var.c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
            char charAt3 = str.charAt(1);
            if (charAt3 == ' ') {
                return s(false);
            }
            if (charAt3 == 'x' || charAt3 == 'X') {
                return s(true);
            }
        }
        if (ll0Var.c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
            c(pageblockparagraph2, "");
            return new wk9(pageblockparagraph2, 1, 1);
        }
        if (ll0Var.c != 0 || length != 4) {
            return null;
        }
        char charAt4 = str.charAt(0);
        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
            return new wk9(new TL_iv.pageBlockDivider(), 0, 0);
        }
        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
            return new wk9(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static wk9 s(boolean z) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        c(pageblockparagraph, "");
        return new wk9(pageblockparagraph, 1, 0, true, z);
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
                pagetablerow.cells.add(fhb.f());
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

    public static boolean x(ne9 ne9Var, int i, int i2, int i3, int i4) {
        int lineForVertical;
        Layout layout = ne9Var.getLayout();
        if (layout != null && ne9Var.length() != 0) {
            int paddingLeft = i3 - (ne9Var.getPaddingLeft() + i);
            int paddingTop = i4 - (ne9Var.getPaddingTop() + i2);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = gm.L(24.0f);
                int max = Math.max(0, (ne9Var.getWidth() - ne9Var.getPaddingLeft()) - ne9Var.getPaddingRight());
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
        return zk9.l(pageBlock.text);
    }

    public static SpannableStringBuilder z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return zk9.r(pageBlock.text, pageBlock, true);
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
        ll0 ll0Var = this.y;
        byte b = 1;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                rf9 rf9Var = new rf9(this, b);
                this.H = rf9Var;
                postDelayed(rf9Var, 100L);
                return;
            }
        }
        this.J++;
        Editable text = this.f.getText();
        if (text != null) {
            for (xk2 xk2Var : (xk2[]) text.getSpans(0, text.length(), xk2.class)) {
                text.removeSpan(xk2Var);
            }
        }
        this.I = null;
    }

    public final void C(ud9 ud9Var) {
        if (this.E == null || this.y == null || ud9Var == null) {
            return;
        }
        List<String> list = ud9Var.c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int p = p(str);
            if (p != 0) {
                ((mg9) this.E).c(this.y, p);
                return;
            }
            wk9 q = q(this.y, str);
            if (q == null) {
                q = r(this.y, td4.p(str, " "));
            }
            if (q != null) {
                ((mg9) this.E).d(this.y, q.a, q.b, q.c, q.d, q.e);
                return;
            }
        }
    }

    public final void D(Editable editable) {
        ll0 ll0Var = this.y;
        if (ll0Var != null && ch9.y3(ll0Var.b) && wi8.A(editable)) {
            ne9 ne9Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = ne9Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((ne9Var.getTextSize() * 0.85f) / 1.2f));
            for (dw3 dw3Var : (dw3[]) editable.getSpans(0, editable.length(), dw3.class)) {
                dw3Var.b = 0.85f;
            }
            for (gn gnVar : (gn[]) editable.getSpans(0, editable.length(), gn.class)) {
                gnVar.replaceFontMetrics(fontMetricsInt);
                gnVar.setSize(max);
            }
        }
    }

    public final void F() {
        uk9 uk9Var;
        ll0 ll0Var = this.y;
        if (ll0Var == null || ll0Var.c <= 0 || (uk9Var = this.E) == null) {
            return;
        }
        int b = ((mg9) uk9Var).b(ll0Var);
        int a = ((mg9) this.E).a(this.y);
        ll0 ll0Var2 = this.y;
        if (ll0Var2.n) {
            b = ll0Var2.l <= 0 ? 0 : gm.L(((r0 - 1) << 4) + 10);
        }
        ll0 ll0Var3 = this.y;
        if (ll0Var3.o) {
            a = ll0Var3.m <= 0 ? 0 : gm.L(((r1 - 1) << 4) + 10);
        }
        if (b == getPaddingTop() && a == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), b, getPaddingRight(), a);
    }

    public final void G() {
        ll0 ll0Var = this.y;
        ne9 ne9Var = this.f;
        ne9 ne9Var2 = this.h;
        if (ll0Var != null && n(ll0Var.b) && (ne9Var.length() > 0 || ne9Var2.length() > 0)) {
            if (ne9Var2.getVisibility() != 0) {
                ne9Var2.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (ne9Var2.getVisibility() != 8) {
            if (ne9Var2.isFocused()) {
                ne9Var.requestFocus();
            }
            ne9Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i;
        Layout layout;
        int lineStart;
        ne9 ne9Var = this.f;
        if (ne9Var.getText() != null) {
            Editable text = ne9Var.getText();
            int i2 = -1;
            if (!m() || !((TL_iv.pageBlockBlockquote) this.y.b).collapsed || (layout = ne9Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i = text.length())) {
                i = -1;
            } else {
                i2 = lineStart;
            }
            if (i2 == this.R && i == this.S) {
                return;
            }
            this.T = true;
            try {
                yl ylVar = this.Q;
                if (ylVar != null) {
                    text.removeSpan(ylVar);
                }
                if (i2 >= 0) {
                    yl ylVar2 = this.Q;
                    if (ylVar2 == null) {
                        ylVar2 = new yl(this, (byte) 2);
                        this.Q = ylVar2;
                    }
                    text.setSpan(ylVar2, i2, i, 33);
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
        ne9 ne9Var = this.h;
        if (ne9Var != null) {
            ne9Var.updateColors();
        }
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.d.setTextColor(cmb.v0(i, ylbVar));
        if (this.L != null) {
            int v0 = cmb.v0(cmb.Ei, ylbVar);
            Drawable drawable = this.L;
            if (drawable != this.U || v0 != this.V) {
                this.U = drawable;
                this.V = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
        }
        p99 p99Var = this.K;
        if (p99Var != null) {
            uue.a(p99Var, ylbVar);
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
            gm.B2(linearLayout);
            this.s = null;
        }
        if (this.s == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.s = linearLayout2;
            linearLayout2.setOrientation(0);
            LinearLayout linearLayout3 = this.s;
            int i = cmb.h6;
            anb.R(linearLayout3, cmb.Y(cmb.v0(i, this.a), gm.L(3.0f), gm.L(3.0f)), null, anb.M(i), this.a);
            this.s.setPadding(gm.L(6.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
            addView(this.s, qoe.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.w = textView;
            byte b = 1;
            textView.setTextSize(1, 12.0f);
            this.w.setGravity(17);
            this.s.addView(this.w, qoe.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.x = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.s.addView(this.x, qoe.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            ml8 ml8Var = el2.a;
            synchronized (ml8Var.a) {
                if (!ml8Var.f) {
                    ml8Var.b.execute(new hl8(ml8Var, (byte) 1));
                }
            }
            this.s.setOnClickListener(new pk9(this, b));
            this.s.setOnLongClickListener(new rk9());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i2 = cmb.F6;
        cmb.p1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, cmb.v0(i2, this.a));
        wmb K = anb.K(TextUtils.isEmpty(str) ? 0.5f : 0.75f, i2);
        ImageView imageView2 = this.x;
        ylb ylbVar = this.a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = K.a;
        float f = K.d;
        int P = anb.P(i3, -1, 2, f, ylbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        anb.N(imageView2, 5, i3, -1, 2, f, ylbVar, P, porterDuffColorFilter).h = mode;
        anb.Y(this.w, K, this.a);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView2 = this.w;
        if (isEmpty) {
            textView2.setText(jb6.M0(2131753982, null));
        } else {
            textView2.setText(h47.b(str));
        }
        this.s.setVisibility(0);
    }

    public final void K() {
        ll0 ll0Var = this.y;
        boolean z = false;
        if (ll0Var != null && ll0Var.d > 0) {
            ne9 ne9Var = this.f;
            if (ne9Var.length() > 0 && (ne9Var.c(0, 1) & 1) != 0) {
                z = true;
            }
        }
        this.d.setTypeface(z ? gm.o() : null);
        ll0 ll0Var2 = this.y;
        if (ll0Var2 == null || ll0Var2.d <= 0) {
            return;
        }
        a(ll0Var2);
    }

    public final void a(ll0 ll0Var) {
        int e;
        int i;
        ll0 ll0Var2;
        int i2;
        int i3 = ll0Var.c;
        xd9 xd9Var = this.e;
        t8 t8Var = this.d;
        View view = this.c;
        if (i3 <= 0) {
            view.setVisibility(8);
            t8Var.setVisibility(8);
            xd9Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = gm.L(24.0f) * (i3 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i3 > 1 ? 0 : 8);
        if (ll0Var.e) {
            t8Var.setVisibility(8);
            xd9Var.setVisibility(0);
            ((CheckBoxBase) xd9Var.b).f(-1, ll0Var.f, false);
            return;
        }
        xd9Var.setVisibility(8);
        t8Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) t8Var.getLayoutParams();
        if (ll0Var.d == 0) {
            e = gm.L(18.0f);
        } else {
            uk9 uk9Var = this.E;
            if (uk9Var != null) {
                TextPaint paint = t8Var.getPaint();
                ArrayList arrayList = ((mg9) uk9Var).a.t3;
                int indexOf = arrayList.indexOf(ll0Var);
                if (indexOf < 0 || (i = ll0Var.c) <= 0 || ll0Var.d <= 0) {
                    e = kt6.e(10.0f, (int) Math.ceil(paint.measureText(hg9.k(new StringBuilder(), ll0Var.d, "."))), gm.L(28.0f));
                } else {
                    int i4 = indexOf;
                    while (i4 > 0) {
                        ll0 ll0Var3 = (ll0) arrayList.get(i4 - 1);
                        int i5 = ll0Var3.c;
                        if (i5 < i || (i5 == i && ll0Var3.d <= 0)) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                    int i6 = indexOf + 1;
                    while (i6 < arrayList.size() && (i2 = (ll0Var2 = (ll0) arrayList.get(i6)).c) >= i && (i2 != i || ll0Var2.d > 0)) {
                        i6++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(gm.o());
                    float f = 0.0f;
                    while (i4 < i6) {
                        ll0 ll0Var4 = (ll0) arrayList.get(i4);
                        if (ll0Var4.c == i && ll0Var4.d > 0) {
                            f = Math.max(f, paint2.measureText(ll0Var4.d + "."));
                        }
                        i4++;
                    }
                    e = kt6.e(10.0f, (int) Math.ceil(f), gm.L(28.0f));
                }
            } else {
                int L = gm.L(28.0f);
                TextPaint paint3 = t8Var.getPaint();
                e = kt6.e(10.0f, (int) Math.ceil(paint3.measureText(ll0Var.d + ".")), L);
            }
        }
        if (layoutParams2.width != e) {
            layoutParams2.width = e;
            t8Var.setLayoutParams(layoutParams2);
        }
        t8Var.setText(ll0Var.d == 0 ? "" : hg9.k(new StringBuilder(), ll0Var.d, "."));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Ei));
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
    public final void d(ll0 ll0Var, uk9 uk9Var, boolean z) {
        float f;
        float f2;
        ll0 ll0Var2;
        int c;
        boolean z2;
        boolean n;
        SpannableStringBuilder spannableStringBuilder;
        this.y = ll0Var;
        this.E = uk9Var;
        this.F = z;
        this.S = -1;
        this.R = -1;
        TL_iv.PageBlock pageBlock = ll0Var.b;
        ne9 ne9Var = this.f;
        ne9Var.setBlock(pageBlock);
        TL_iv.PageBlock pageBlock2 = ll0Var.b;
        int i = gda.S0;
        ne9Var.setCenterEmptyHint(false);
        ne9Var.setHint(getHint());
        ne9Var.setTextColorKey(cmb.F6);
        ne9Var.setLineSpacing(0.0f, 1.0f);
        if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
            f = 8.0f;
            setPadding(gm.L(16.0f), gm.L(31.0f), gm.L(16.0f), gm.L(19.0f));
            ne9Var.setInputType(655505);
            ne9Var.setAllowNewlines(true);
            ne9Var.setSoftEnterNewline(false);
            ne9Var.setGravity(8388659);
            ne9Var.setTextSize(1, i - 1);
            ne9Var.setTypeface(Typeface.MONOSPACE);
            ne9Var.setLineSpacing(ne9Var.getPaint().getFontSpacing() * 0.3f, 1.0f);
            ne9Var.setAccentHint(false);
        } else {
            f = 8.0f;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                ne9Var.setInputType(147457);
                ne9Var.setAllowNewlines(false);
                ne9Var.setSoftEnterNewline(false);
                ne9Var.setGravity(8388659);
                setPadding(gm.L(28.0f), gm.L(16.0f), gm.L(24.0f), gm.L(16.0f));
                ne9Var.setTextSize(1, Math.max(8, i - 2));
                ne9Var.setTypeface(null);
                ne9Var.setAccentHint(true);
            } else {
                if (!(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                    ne9Var.setInputType(147457);
                    ne9Var.setAllowNewlines(false);
                    ne9Var.setSoftEnterNewline(false);
                    ne9Var.setGravity(8388659);
                    boolean z3 = pageBlock2 instanceof TL_iv.pageBlockHeading1;
                    boolean z4 = z3 || (pageBlock2 instanceof TL_iv.pageBlockHeading2) || (pageBlock2 instanceof TL_iv.pageBlockHeading3) || (pageBlock2 instanceof TL_iv.pageBlockHeading4) || (pageBlock2 instanceof TL_iv.pageBlockHeading5) || (pageBlock2 instanceof TL_iv.pageBlockHeading6);
                    f2 = 24.0f;
                    setPadding(gm.L(16.0f), gm.L(z4 ? 11.0f : 5.0f), gm.L(16.0f), gm.L(z4 ? 7.0f : 4.66f));
                    ll0 ll0Var3 = this.y;
                    if (ll0Var3 != null && ll0Var3.c > 0) {
                        int L = gm.L(16.0f);
                        uk9 uk9Var2 = this.E;
                        int b = uk9Var2 != null ? ((mg9) uk9Var2).b(this.y) : gm.L(8.0f);
                        int L2 = gm.L(16.0f);
                        uk9 uk9Var3 = this.E;
                        setPadding(L, b, L2, uk9Var3 != null ? ((mg9) uk9Var3).a(this.y) : gm.L(11.0f));
                    }
                    if (z3) {
                        ne9Var.setTextSize(1, i + 3);
                        ne9Var.setTypeface(gm.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        ne9Var.setTextSize(1, i + 2);
                        ne9Var.setTypeface(gm.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        ne9Var.setTextSize(1, i + 1);
                        ne9Var.setTypeface(gm.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        ne9Var.setTextSize(1, i);
                        ne9Var.setTypeface(gm.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        ne9Var.setTextSize(1, i - 1);
                        ne9Var.setTypeface(gm.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        ne9Var.setTextSize(1, i - 2);
                        ne9Var.setTypeface(gm.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        ne9Var.setTextSize(1, i - 2);
                        ne9Var.setTypeface(null);
                        ne9Var.setTextColorKey(cmb.Od);
                    } else {
                        ne9Var.setTextSize(1, (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) || (ll0Var2 = this.y) == null || ll0Var2.k.isEmpty()) ? i : Math.max(8, i - 2));
                        ne9Var.setTypeface(null);
                    }
                    ne9Var.setAccentHint(false);
                    c = uue.c(ll0Var);
                    int d = uue.d(ll0Var);
                    if (c <= 0 || d > 0) {
                        z2 = ll0Var.b instanceof TL_iv.pageBlockPreformatted;
                        int paddingTop = getPaddingTop();
                        int paddingBottom = getPaddingBottom();
                        if (ll0Var.n) {
                            paddingTop = (ll0Var.l <= 0 ? 0 : gm.L(((r7 - 1) << 4) + 10)) + (z2 ? gm.L(f2) : 0);
                        }
                        if (ll0Var.o) {
                            paddingBottom = ll0Var.m <= 0 ? 0 : gm.L(((r8 - 1) << 4) + 10);
                        }
                        if (z2) {
                            c += gm.L(f);
                            d += gm.L(f);
                        }
                        if (jb6.a0) {
                            setPadding(getPaddingLeft() + c, paddingTop, getPaddingRight() + d, paddingBottom);
                        } else {
                            setPadding(getPaddingLeft() + d, paddingTop, getPaddingRight() + c, paddingBottom);
                        }
                    }
                    a(ll0Var);
                    J(ll0Var.b, false);
                    if (!String.valueOf(ne9Var.getText()).equals(y(ll0Var.b))) {
                        SpannableStringBuilder z5 = z(ll0Var.b);
                        if (ch9.y3(ll0Var.b)) {
                            SpannableString spannableString = new SpannableString(z5);
                            zk9.o(spannableString, 0, spannableString.length(), 1, false, null);
                            zk9.o(spannableString, 0, spannableString.length(), 2, false, null);
                            spannableStringBuilder = spannableString;
                        } else {
                            spannableStringBuilder = z5;
                        }
                        ne9Var.setTextSilently(gw3.n(spannableStringBuilder, ne9Var.getPaint().getFontMetricsInt(), false, null, 0, ch9.y3(ll0Var.b) ? 0.85f : 1.0f, 0));
                        D(ne9Var.getText());
                        ne9Var.f();
                        this.I = null;
                    }
                    D(ne9Var.getText());
                    K();
                    TL_iv.PageBlock pageBlock3 = ll0Var.b;
                    n = n(pageBlock3);
                    ne9 ne9Var2 = this.h;
                    if (n) {
                        ne9Var2.setVisibility(8);
                    } else {
                        g(pageBlock3);
                        ne9Var2.setTextSize(1, Math.max(8, gda.S0 - 2));
                        ne9Var2.setTypeface(gm.n1("fonts/rmedium.ttf"));
                        ne9Var2.setTextColorKey(cmb.Ei);
                        ne9Var2.setAccentHint(true);
                        ne9Var2.setHint(jb6.M0(2131753985, null));
                        if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                            ne9Var2.setGravity(49);
                        } else {
                            ne9Var2.setGravity(8388659);
                        }
                        if (!String.valueOf(ne9Var2.getText()).equals(zk9.l(h(pageBlock3)))) {
                            ne9Var2.setTextSilently(gw3.m(zk9.r(h(pageBlock3), null, true), ne9Var2.getPaint().getFontMetricsInt(), false, null, 0));
                            ne9Var2.f();
                        }
                        G();
                    }
                    B();
                }
                ne9Var.setInputType(147457);
                ne9Var.setAllowNewlines(false);
                ne9Var.setSoftEnterNewline(true);
                ne9Var.setGravity(49);
                ne9Var.setCenterEmptyHint(true);
                setPadding(gm.L(40.0f), gm.L(16.0f), gm.L(40.0f), gm.L(16.0f));
                ne9Var.setTextSize(1, Math.max(8, i - 2));
                ne9Var.setTypeface(gm.n1("fonts/ritalic.ttf"));
                ne9Var.setAccentHint(true);
            }
        }
        f2 = 24.0f;
        c = uue.c(ll0Var);
        int d2 = uue.d(ll0Var);
        if (c <= 0) {
        }
        z2 = ll0Var.b instanceof TL_iv.pageBlockPreformatted;
        int paddingTop2 = getPaddingTop();
        int paddingBottom2 = getPaddingBottom();
        if (ll0Var.n) {
        }
        if (ll0Var.o) {
        }
        if (z2) {
        }
        if (jb6.a0) {
        }
        a(ll0Var);
        J(ll0Var.b, false);
        if (!String.valueOf(ne9Var.getText()).equals(y(ll0Var.b))) {
        }
        D(ne9Var.getText());
        K();
        TL_iv.PageBlock pageBlock32 = ll0Var.b;
        n = n(pageBlock32);
        ne9 ne9Var22 = this.h;
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
        ne9 ne9Var;
        float f;
        gkb textSelectionHelper;
        float f2;
        float f3;
        Canvas canvas3;
        float f4;
        int i;
        ll0 ll0Var = this.y;
        Paint paint = this.a0;
        LinearLayout linearLayout = this.b;
        ylb ylbVar = this.a;
        ne9 ne9Var2 = this.f;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                paint.setColor(cmb.v0(cmb.nl, ylbVar));
                int c = uue.c(this.y);
                int d = uue.d(this.y);
                int width = getWidth();
                if (c > 0 || d > 0) {
                    int L = gm.L(16.0f) + c;
                    int L2 = gm.L(16.0f) + d;
                    i = jb6.a0 ? L2 : L;
                    int width2 = getWidth();
                    if (!jb6.a0) {
                        L = L2;
                    }
                    width = width2 - L;
                } else {
                    i = 0;
                }
                float L3 = (i > 0 || width < getWidth()) ? gm.L(8.0f) : 0;
                ne9Var = ne9Var2;
                canvas2 = canvas;
                canvas2.drawRoundRect(i, gm.L(7.0f), width, getHeight() - gm.L(7.0f), L3, L3, paint);
            } else {
                ne9Var = ne9Var2;
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    if (this.K == null) {
                        p99 p99Var = new p99(this);
                        this.K = p99Var;
                        p99Var.a(null, null, null, this.a, 1);
                        uue.a(this.K, ylbVar);
                    }
                    RectF rectF = gm.P;
                    rectF.set(gm.L(16.0f), gm.L(8.0f), getWidth() - gm.L(16.0f), getHeight() - gm.L(8.0f));
                    float floor = (float) Math.floor(gda.U0 / 3.0f);
                    canvas3 = canvas;
                    this.K.c(floor, floor, floor, 1.0f, canvas3, rectF);
                    this.K.f(canvas3, rectF, 1.0f);
                } else {
                    canvas3 = canvas;
                    if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        if (this.K == null) {
                            p99 p99Var2 = new p99(this);
                            this.K = p99Var2;
                            p99Var2.a(null, null, null, this.a, 1);
                            uue.a(this.K, ylbVar);
                        }
                        if (this.L == null) {
                            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                            this.L = mutate;
                            mutate.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.Ei, ylbVar), PorterDuff.Mode.SRC_IN));
                        }
                        Layout layout = ne9Var.getLayout();
                        float width3 = getWidth();
                        if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                            f4 = 0.0f;
                            for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
                                width3 = Math.min(width3, layout.getLineLeft(i2) + ne9Var.getPaddingLeft() + ne9Var.getLeft() + linearLayout.getLeft());
                                f4 = Math.max(f4, layout.getLineRight(i2) + ne9Var.getPaddingLeft() + ne9Var.getLeft() + linearLayout.getLeft());
                            }
                        } else if (ne9Var.getHint() != null) {
                            float measureText = ne9Var.getPaint().measureText(ne9Var.getHint().toString());
                            width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + gm.L(2.0f));
                            f4 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + gm.L(2.0f));
                        } else {
                            f4 = 0.0f;
                        }
                        ne9 ne9Var3 = this.h;
                        if (ne9Var3.getVisibility() == 0) {
                            Layout layout2 = ne9Var3.getLayout();
                            if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                                for (int i3 = 0; i3 < layout2.getLineCount(); i3++) {
                                    width3 = Math.min(width3, layout2.getLineLeft(i3) + ne9Var3.getPaddingLeft() + ne9Var3.getLeft());
                                    f4 = Math.max(f4, layout2.getLineRight(i3) + ne9Var3.getPaddingLeft() + ne9Var3.getLeft());
                                }
                            } else if (ne9Var3.getHint() != null) {
                                float measureText2 = ne9Var3.getPaint().measureText(ne9Var3.getHint().toString());
                                width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + gm.L(2.0f));
                                f4 = Math.max(f4, ((getWidth() + measureText2) / 2.0f) + gm.L(2.0f));
                            }
                        }
                        if (width3 < f4) {
                            float L4 = width3 - gm.L(30.0f);
                            float L5 = gm.L(30.0f) + f4;
                            float floor2 = (float) Math.floor(gda.U0 / 2.0f);
                            int L6 = gm.L(8.0f);
                            int height = getHeight() - gm.L(8.0f);
                            RectF rectF2 = gm.P;
                            f = 2.0f;
                            rectF2.set(L4, L6, L5, height);
                            this.K.c(floor2, floor2, floor2, 1.0f, canvas3, rectF2);
                            canvas2 = canvas3;
                            canvas2.save();
                            int i4 = (int) L4;
                            this.L.setBounds(gm.L(8.0f) + i4, gm.L(7.0f) + L6, this.L.getIntrinsicWidth() + gm.L(8.0f) + i4, this.L.getIntrinsicHeight() + gm.L(7.0f) + L6);
                            canvas2.scale(-1.0f, -1.0f, this.L.getBounds().centerX(), this.L.getBounds().centerY());
                            this.L.draw(canvas2);
                            canvas2.restore();
                            canvas2.save();
                            int i5 = (int) L5;
                            this.L.setBounds((i5 - gm.L(8.0f)) - this.L.getIntrinsicWidth(), (height - gm.L(7.0f)) - this.L.getIntrinsicHeight(), i5 - gm.L(8.0f), height - gm.L(7.0f));
                            canvas2.scale(1.0f, -1.0f, this.L.getBounds().centerX(), this.L.getBounds().centerY());
                            this.L.draw(canvas2);
                            canvas2.restore();
                            if (this.W) {
                                float width4 = getWidth();
                                float height2 = getHeight();
                                Layout layout3 = ne9Var.getLayout();
                                if (layout3 != null) {
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                    for (int i6 = 0; i6 < layout3.getLineCount(); i6++) {
                                        height2 = Math.min(height2, layout3.getLineTop(i6) + ne9Var.getPaddingTop() + getPaddingTop());
                                        width4 = Math.min(width4, layout3.getLineLeft(i6) + ne9Var.getPaddingLeft() + ne9Var.getLeft() + linearLayout.getLeft());
                                        f2 = Math.max(f2, layout3.getLineRight(i6) + ne9Var.getPaddingLeft() + ne9Var.getLeft() + linearLayout.getLeft());
                                        f3 = Math.max(height2, layout3.getLineBottom(i6) + ne9Var.getPaddingTop() + getPaddingTop());
                                    }
                                } else {
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                }
                                if (width4 < f2 && height2 < f3) {
                                    float L7 = width4 - gm.L(4.0f);
                                    paint.setColor(cmb.p1(0.05f, cmb.v0(cmb.F6, ylbVar)));
                                    canvas2.drawRoundRect(L7, height2 - gm.L(f), f2 + gm.L(4.0f), f3 + gm.L(f), gm.L(4.0f), gm.L(4.0f), paint);
                                }
                            }
                            uk9 uk9Var = this.E;
                            textSelectionHelper = uk9Var == null ? ((mg9) uk9Var).a.getTextSelectionHelper() : null;
                            if (textSelectionHelper != null) {
                                ArrayList arrayList = this.r;
                                arrayList.clear();
                                k(arrayList);
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    qkb qkbVar = (qkb) arrayList.get(i7);
                                    canvas2.save();
                                    canvas2.translate(qkbVar.getX(), qkbVar.getY());
                                    textSelectionHelper.Y(canvas2, this, i7);
                                    canvas2.restore();
                                }
                            }
                            super.dispatchDraw(canvas);
                            if (m()) {
                                return;
                            }
                            if (this.M == null) {
                                this.M = new u30(this);
                            }
                            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.y.b;
                            int v0 = cmb.v0(cmb.Ei, ylbVar);
                            int L8 = gm.L(3.333f);
                            this.M.d(canvas2, this.N, kt6.y(16.0f, getWidth(), L8), kt6.y(8.0f, getHeight(), L8), v0, pageblockblockquote.collapsed, i());
                            return;
                        }
                    }
                }
                canvas2 = canvas3;
            }
        } else {
            canvas2 = canvas;
            ne9Var = ne9Var2;
        }
        f = 2.0f;
        if (this.W) {
        }
        uk9 uk9Var2 = this.E;
        if (uk9Var2 == null) {
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
                        uk9 uk9Var = this.E;
                        if (uk9Var != null) {
                            ch9 ch9Var = ((mg9) uk9Var).a;
                            of9 of9Var = ch9Var.R3;
                            if (of9Var != null) {
                                of9Var.g();
                            }
                            ch9Var.p3.onContentChanged();
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
            ne9 ne9Var = this.h;
            if (ne9Var.getVisibility() == 0 && (layout = ne9Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.M == null) {
                    this.M = new u30(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + ne9Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + ne9Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + ne9Var.getPaddingTop() + measuredHeight;
                int L = gm.L(3.333f);
                float y = kt6.y(16.0f, i, L);
                this.M.getClass();
                float L2 = y - ((gm.L(23.66f) + r6.b) + (gm.L(3.333f) << 1));
                this.M.getClass();
                int i3 = i2 - L;
                float L3 = i3 - gm.L(17.66f);
                float f = i3;
                boolean z = lineRight > L2;
                boolean z2 = lineBottom > L3 && lineTop < f;
                if (z && z2) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + gm.L(4.0f)) + r9) + L) - i2));
                }
            }
        }
        return 0;
    }

    public final void f() {
        ll0 ll0Var = this.y;
        if (ll0Var != null) {
            g(ll0Var.b);
        }
        ne9 ne9Var = this.h;
        if (ne9Var.getVisibility() != 0) {
            ne9Var.setVisibility(0);
            requestLayout();
        }
        ne9Var.O();
        ne9Var.setSelection(ne9Var.length());
    }

    public ne9 getAuthorEditText() {
        return this.h;
    }

    public ne9 getEditText() {
        return this.f;
    }

    public ll0 getRow() {
        return this.y;
    }

    public gm4 getStyleDelegate() {
        return this.f;
    }

    public final boolean i() {
        Layout layout;
        return m() && (layout = this.f.getLayout()) != null && layout.getLineCount() > 3;
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        Layout layout;
        ne9 ne9Var = this.f;
        Layout layout2 = ne9Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new zj9(layout2, ne9Var.getPaddingLeft() + ne9Var.getLeft() + linearLayout.getLeft(), ne9Var.getPaddingTop() + ne9Var.getTop() + linearLayout.getTop(), (byte) 1));
        }
        ne9 ne9Var2 = this.h;
        if (ne9Var2.getVisibility() != 0 || (layout = ne9Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new zj9(layout, ne9Var2.getPaddingLeft() + ne9Var2.getLeft(), ne9Var2.getPaddingTop() + ne9Var2.getTop(), (byte) 2));
    }

    public final boolean l() {
        return this.h.getVisibility() == 0;
    }

    public final boolean m() {
        ll0 ll0Var = this.y;
        return ll0Var != null && (ll0Var.b instanceof TL_iv.pageBlockBlockquote);
    }

    public final void o(boolean z) {
        uk9 uk9Var;
        this.f.setHint(getHint());
        if (z || (uk9Var = this.E) == null) {
            return;
        }
        ((mg9) uk9Var).a.p3.b(this, null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        H();
        ne9 ne9Var = this.h;
        if (ne9Var.getVisibility() == 8) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        ne9Var.layout(paddingLeft, measuredHeight, ne9Var.getMeasuredWidth() + paddingLeft, ne9Var.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        F();
        int size = View.MeasureSpec.getSize(i);
        ne9 ne9Var = this.h;
        if (ne9Var.getVisibility() == 8) {
            this.P = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, 0);
        ne9Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), 0);
        int paddingBottom = getPaddingBottom() + ne9Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
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

    @Override // vlb
    public final void updateColors() {
        try {
            I();
            if (getBackground() instanceof gf9) {
                ((gf9) getBackground()).a(cmb.v0(cmb.c6, this.a));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v() {
        ll0 ll0Var = this.y;
        if (ll0Var == null || !n(ll0Var.b)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.y.b;
        TL_iv.RichText f = zk9.f(this.h.getText());
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
        u30 u30Var = this.M;
        if (u30Var != null) {
            return drawable == ((ho) u30Var.e) || drawable == ((c09) u30Var.f);
        }
        return false;
    }

    public final void w() {
        ll0 ll0Var = this.y;
        if (ll0Var != null) {
            b(ll0Var.b, this.f.getText());
        }
    }
}
