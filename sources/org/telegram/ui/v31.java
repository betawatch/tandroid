package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((w31) this.b).dismiss();
                break;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 2:
                ((g41) this.b).dismiss();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.e0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ph.f3 f3Var = secretMediaViewer.r;
                        if (f3Var.S) {
                            f3Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 4:
                i71 i71Var = (i71) this.b;
                if (i71Var.X instanceof TLRPC.User) {
                    ph.d dVar = i71Var.e0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        i71Var.T((TLRPC.User) i71Var.X, null, null);
                        break;
                    }
                }
                break;
            case 5:
                j81.a((j81) this.b);
                break;
            case 6:
                ((yd1) this.b).c(true);
                break;
            case 7:
                ((yd1) ((gg.u) this.b).c).c(true);
                break;
            case 8:
                ge1 ge1Var = (ge1) this.b;
                ArrayList arrayList = ge1Var.f;
                HashSet hashSet = ge1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ge1Var.getMessagesController().getUser(Long.valueOf(ge1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ge1Var.getMessagesController().putChat(chat, false);
                        ge1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    ge1Var.finishFragment();
                    break;
                }
                break;
            default:
                aj1 aj1Var = (aj1) this.b;
                aj1Var.a.c(!r0.b(), true);
                aj1Var.c.setEnabled(aj1Var.a.b());
                aj1Var.c.animate().alpha(aj1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
