// default package

import android.util.Property;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qw1 extends Property {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        super(Float.class, "attach_scale");
        this.a = b;
        switch (b) {
            case 1:
                this.b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                break;
            case 2:
                this.b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                break;
            case 3:
                this.b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                break;
            case 4:
                this.b = chatActivityEnterView;
                super(Float.class, "emoji_button_scale");
                break;
            default:
                this.b = chatActivityEnterView;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(chatActivityEnterView.F);
            case 1:
                return Float.valueOf(chatActivityEnterView.n);
            case 2:
                return Float.valueOf(chatActivityEnterView.y);
            case 3:
                return Float.valueOf(chatActivityEnterView.H);
            default:
                return Float.valueOf(chatActivityEnterView.h);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                chatActivityEnterView.F = ((Float) obj2).floatValue();
                chatActivityEnterView.s2();
                break;
            case 1:
                chatActivityEnterView.n = ((Float) obj2).floatValue();
                chatActivityEnterView.x2();
                break;
            case 2:
                chatActivityEnterView.y = ((Float) obj2).floatValue();
                chatActivityEnterView.s2();
                break;
            case 3:
                chatActivityEnterView.H = ((Float) obj2).floatValue();
                chatActivityEnterView.B2();
                break;
            default:
                chatActivityEnterView.h = ((Float) obj2).floatValue();
                chatActivityEnterView.x2();
                break;
        }
    }
}
