// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yg3 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ yg3(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // qac
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                hh3 hh3Var = (hh3) ((View) obj);
                hh3Var.invalidate();
                hh3Var.E.setTextColor(i);
                break;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i2);
                        i2++;
                        vm.g(i).b(emojiGroup.icon_emoji_id, null);
                    }
                    break;
                }
                break;
        }
    }
}
